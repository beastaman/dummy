package com.sapient.dao;

import com.sapient.constants.Constants;
import com.sapient.entity.Product;
import com.sapient.service.DbService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private static Connection con;
    static {
        try {
            con = DbService.getConnection();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void insert(Product product) throws Exception{
        PreparedStatement ps = con.prepareStatement(Constants.INSERT_PRODUCT);
        ps.setString(1, product.getName());
        ps.setString(2, product.getBrand());
        ps.setString(3, product.getMadeIn());
        ps.setString(4, String.valueOf(product.getPrice()));
        ps.executeUpdate();
    }

    public static List<Product> findAll() throws Exception{
        List<Product> productList = new ArrayList<>();
        PreparedStatement ps = con.prepareStatement(Constants.FIND_ALL_PRODUCT);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            productList.add(Product.builder()
                    .pid(Integer.parseInt(rs.getString(1)))
                    .name(rs.getString(2))
                    .brand(rs.getString(3))
                    .madeIn(rs.getString(4))
                    .price(Integer.parseInt(rs.getString(5)))
                    .build());
        }
        return productList;
    }
    public static void deleteById(Integer id) throws Exception{
        PreparedStatement ps = con.prepareStatement(Constants.DELETE_PRODUCT_BY_ID);
        ps.setString(1, String.valueOf(id));
        ps.executeUpdate();
    }
}

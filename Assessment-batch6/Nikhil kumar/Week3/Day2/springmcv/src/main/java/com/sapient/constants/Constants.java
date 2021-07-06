package com.sapient.constants;

public class Constants {
    public final static String FIND_ALL_STUDENT="select * from student";
    public final static String INSERT_PRODUCT="insert into product(name,brand,madein,price) values(?,?,?,?)";
    public final static String FIND_ALL_PRODUCT="select * from product";
    public final static String DELETE_PRODUCT_BY_ID="delete from product where pid=?";
}

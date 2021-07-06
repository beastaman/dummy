package com.sapient.to;

public class Product {
    private String id;
    private String name;
    private String brand;
    private String madein;
    private int price;

    public Product() {

    }

    public Product(String id, String name, String brand, String madein, int price) {
        super();
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.madein = madein;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMadein() {
        return madein;
    }

    public void setMadein(String madein) {
        this.madein = madein;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", brand=" + brand + ", madein=" + madein + ", price=" + price + "]";
    }

}

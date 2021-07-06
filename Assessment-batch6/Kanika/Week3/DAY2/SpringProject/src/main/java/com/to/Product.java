package com.to;

public class Product {

	private String name;
	private String brand;
	private String madein;
	private double price;
	
	
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", brand=" + brand + ", madein=" + madein + ", price=" + price + "]";
	}

	public Product(String name, String brand, String madein, double price) {
		super();
		this.name = name;
		this.brand = brand;
		this.madein = madein;
		this.price = price;
	}

	public Product() {
		super();
	}

	public String getName() {
		return name;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

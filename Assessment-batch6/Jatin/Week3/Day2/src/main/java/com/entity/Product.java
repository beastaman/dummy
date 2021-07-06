package com.entity;

public class Product {
	private String name;
	private String brand;
	private String madein;
	private int price;

	public Product() {
		super();
	}

	public Product(String name, String brand, String madein, int price) {
		super();
		this.name = name;
		this.brand = brand;
		this.madein = madein;
		this.price = price;
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

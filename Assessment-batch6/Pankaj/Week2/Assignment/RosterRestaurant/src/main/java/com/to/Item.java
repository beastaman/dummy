package com.to;

public class Item {
	private String item_id;
	private String name;
	private String calories;
	private String price;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(String item_id, String name, String calories, String price) {
		super();
		this.item_id = item_id;
		this.name = name;
		this.calories = calories;
		this.price = price;
	}

	public String getItem_id() {
		return item_id;
	}

	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCalories() {
		return calories;
	}

	public void setCalories(String calories) {
		this.calories = calories;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}

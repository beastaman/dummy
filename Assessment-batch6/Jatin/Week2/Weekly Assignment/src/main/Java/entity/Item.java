package com.entity;

public class Item {
	private int itemid;
	private String itemName;
	private int itemPrice;
	private int branchid;

	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", branchid="
				+ branchid + "]";
	}

	public Item() {
	}

	public Item(int itemid, String itemName, int itemPrice, int branchid) {
		super();
		this.itemid = itemid;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.branchid = branchid;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getBranchid() {
		return branchid;
	}

	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}
}

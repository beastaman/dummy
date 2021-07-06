package com.to;

public class Menu {
	private int menuId;
	private String itemName;
	private int itemPrice;
	
	public Menu(int menuId, String itemName, int itemPrice) {
		super();
		this.menuId = menuId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
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
	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + "]";
	}
	
}

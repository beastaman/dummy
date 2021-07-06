package com.entity;

public class OrdersAndItems {
	private int ordersanditemsid;
	private int itemsid;
	private int orderid;

	@Override
	public String toString() {
		return "OrdersAndItems [ordersanditemsid=" + ordersanditemsid + ", itemsid=" + itemsid + ", orderid=" + orderid
				+ "]";
	}

	public OrdersAndItems() {
		super();
	}

	public OrdersAndItems(int ordersanditemsid, int itemsid, int orderid) {
		super();
		this.ordersanditemsid = ordersanditemsid;
		this.itemsid = itemsid;
		this.orderid = orderid;
	}

	public int getOrdersanditemsid() {
		return ordersanditemsid;
	}

	public void setOrdersanditemsid(int ordersanditemsid) {
		this.ordersanditemsid = ordersanditemsid;
	}

	public int getItemsid() {
		return itemsid;
	}

	public void setItemsid(int itemsid) {
		this.itemsid = itemsid;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

}

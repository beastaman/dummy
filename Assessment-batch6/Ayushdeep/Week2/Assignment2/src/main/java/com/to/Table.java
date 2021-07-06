package com.to;

public class Table {
	private String table_id;
	public String branch_id;
	public String status;
	public String seat;
	public String price;
	
	public Table(String table_id, String branch_id, String status, String seat, String price) {
		super();
		this.table_id = table_id;
		this.branch_id = branch_id;
		this.status = status;
		this.seat = seat;
		this.price = price;
	}
	public String getTable_id() {
		return table_id;
	}
	public void setTable_id(String table_id) {
		this.table_id = table_id;
	}
	public String getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	

}

package com.to;

public class Reservation {
	private String Branch;
	private String TableId;
	private int Capacity;
	private String Date;
	private String Time;
	private String Status;
	
	public Reservation() {
		super();
	}
	public Reservation(String branch, String tableId, int capacity, String date, String time, String status) {
		super();
		Branch = branch;
		TableId = tableId;
		Capacity = capacity;
		Date = date;
		Time = time;
		Status = status;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getTableId() {
		return TableId;
	}
	public void setTableId(String tableId) {
		TableId = tableId;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "Reservation [Branch=" + Branch + ", TableId=" + TableId + ", Capacity=" + Capacity + ", Date=" + Date
				+ ", Time=" + Time + ", Status=" + Status + "]";
	}
	
}

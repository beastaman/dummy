package com.to;

public class Table {
	private String orderId;
	private String branchId;
	private String tableId;
	private String startTime;
	private String userId;
	private String endTime;
	
	public Table() {
		
	}
	
	public Table(String orderId, String branchId, String tableId, String startTime, String endTime,String userId) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.branchId = branchId;
		this.tableId = tableId;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getTableId() {
		return tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	@Override
	public String toString() {
		return "branch id: " + branchId + ", tableId: "+ tableId + ", branchId: " + branchId + ", startTime: "+ startTime + ", endTime: " + endTime;
	}
	
}

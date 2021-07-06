package com.to;

public class ParcelOrderTO {

	private int id;
	private int customerId;
	private int branchId;
	private String status;
	private String createdOn;

	public ParcelOrderTO() {
		super();
	}

	public ParcelOrderTO(int id, int customerId, int branchId, String status) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.branchId = branchId;
		this.status = status;
	}

	public ParcelOrderTO(int id, int customerId, int branchId, String status, String createdOn) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.branchId = branchId;
		this.status = status;
		this.createdOn = createdOn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	
	
	
}

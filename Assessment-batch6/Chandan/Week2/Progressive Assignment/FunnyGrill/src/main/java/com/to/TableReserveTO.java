package com.to;

public class TableReserveTO {

	private int id;
	private int customerId;
	private int branchId;
	private int slotId;
	private String status;
	private String reserveDate;

	public TableReserveTO() {
		super();
	}

	public TableReserveTO(int id, int customerId, int branchId, int slotId, String status, String reserveDate) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.branchId = branchId;
		this.slotId = slotId;
		this.status = status;
		this.reserveDate = reserveDate;
	}

	public String getReserveDate() {
		return reserveDate;
	}

	public void setReserveDate(String reserveDate) {
		this.reserveDate = reserveDate;
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

	public int getSlotId() {
		return slotId;
	}

	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

package com.to;

public class Table {
	private int tableId;
	private int branchId;
	private String tableStatus;
	/**
	 * @param tableId
	 * @param branchId
	 * @param tableStatus
	 */
	public Table(int tableId, int branchId, String tableStatus) {
		super();
		this.tableId = tableId;
		this.branchId = branchId;
		this.tableStatus = tableStatus;
	}
	public int getTableId() {
		return tableId;
	}
	public void setTableId(int tableId) {
		this.tableId = tableId;
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getTableStatus() {
		return tableStatus;
	}
	public void setTableStatus(String tableStatus) {
		this.tableStatus = tableStatus;
	}
	@Override
	public String toString() {
		return "Table [tableId=" + tableId + ", branchId=" + branchId + ", tableStatus=" + tableStatus + "]";
	}
	
}

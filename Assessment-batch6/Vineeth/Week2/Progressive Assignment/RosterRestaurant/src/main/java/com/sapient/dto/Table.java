package com.sapient.dto;

import java.util.ArrayList;
import java.util.List;

public class Table {

	private int id;
	private int branchId;
	private int tableNo;
	private List<Reservation> reservations = new ArrayList<>();
	
	public Table() {
		super();
	}
	
	public Table(int id, int branchId, int tableNo) {
		super();
		this.id = id;
		this.branchId = branchId;
		this.tableNo = tableNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public int getTableNo() {
		return tableNo;
	}

	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

}

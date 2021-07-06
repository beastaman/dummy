package com.sapient.dto;

import java.sql.Timestamp;

public class ReservationDetails {

	private int id;
	private int userId;
	private String branchName;
	private int tableNo;
	private Timestamp startTime;
	private Timestamp endTime;
	private int duration;

	public ReservationDetails() {
		super();
	}
	
	public ReservationDetails(int id, int userId, String branchName, int tableNo, Timestamp startTime, Timestamp endTime, int duration) {
		super();
		this.id = id;
		this.userId = userId;
		this.branchName = branchName;
		this.tableNo = tableNo;
		this.startTime = startTime;
		this.endTime = endTime;
		this.duration = duration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getTableNo() {
		return tableNo;
	}

	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "ReservationDetails [id=" + id + ", userId=" + userId + ", branchName=" + branchName + ", tableNo="
				+ tableNo + ", startTime=" + startTime + ", endTime=" + endTime + ", duration=" + duration + "]";
	}
	
}

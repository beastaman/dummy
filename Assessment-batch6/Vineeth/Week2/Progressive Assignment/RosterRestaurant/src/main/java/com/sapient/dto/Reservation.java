package com.sapient.dto;

import java.sql.Timestamp;

public class Reservation {

	private int id;
	private int tableId;
	private int userId;
	private Timestamp startTime;
	private int duration;

	public Reservation() {
		super();
	}

	public Reservation(int id, int tableId, int userId, Timestamp startTime, int duration) {
		super();
		this.id = id;
		this.tableId = tableId;
		this.userId = userId;
		this.startTime = startTime;
		this.duration = duration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTableId() {
		return tableId;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}

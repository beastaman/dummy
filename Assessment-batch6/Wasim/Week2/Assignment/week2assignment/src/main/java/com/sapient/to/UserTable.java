package com.sapient.to;

public class UserTable {

	private String uid;
	private String tid;

	public UserTable(String uid, String tid) {
		super();
		this.uid = uid;
		this.tid = tid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	@Override
	public String toString() {
		return "Usertable [uid=" + uid + ", tid=" + tid + "]";
	}

}

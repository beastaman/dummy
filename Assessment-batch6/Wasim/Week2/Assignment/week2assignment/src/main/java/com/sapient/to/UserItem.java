package com.sapient.to;

public class UserItem {

	private String uid;
	private String fid;
	private String qty;
	
	public UserItem(String uid, String fid, String qty) {
		super();
		this.uid = uid;
		this.fid = fid;
		this.qty = qty;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "UserItem [uid=" + uid + ", fid=" + fid + ", qty=" + qty + "]";
	}
	
	
	
	
}

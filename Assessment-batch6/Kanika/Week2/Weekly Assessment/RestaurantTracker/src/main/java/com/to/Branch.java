package com.to;

public class Branch {
	private String branch_id;
	public String branch_name;
	public String branch_number;
	
	public Branch(String branch_id,String branch_name, String branch_number) {
		super();
		this.branch_id = branch_id;
		this.branch_name = branch_name;
		this.branch_number = branch_number;
	}
	
	public Branch() {
		// TODO Auto-generated constructor stub
	}

	public String getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getBranch_number() {
		return branch_number;
	}
	public void setBranch_number(String branch_number) {
		this.branch_number = branch_number;
	}
	@Override
	public String toString() {
		return "Branch [branch_id=" + branch_id + ", branch_name=" + branch_name + ", branch_number=" + branch_number
				+ "]";
	}
	

}

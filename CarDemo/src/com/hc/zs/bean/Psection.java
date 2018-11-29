package com.hc.zs.bean;

public class Psection {
    
	private  int staffID;//1  2
	private String Pname;//1管理员   2销售
	public Psection() {
		super();
	}
	public Psection(int staffID, String pname) {
		super();
		this.staffID = staffID;
		Pname = pname;
	}
	public int getStaffID() {
		return staffID;
	}
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	@Override
	public String toString() {
		return "Psection [staffID=" + staffID + ", Pname=" + Pname + "]";
	}
	
}

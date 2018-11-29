package com.hc.zs.bean;



public class Cmanagement {//客户管理系统
	
	private int customerID ;//客户ID
	private String customerName;//客户名
	private String loanInformation;//贷款信息
	private String city;//省、市
	private String phoneNum;//手机
	private int state;//状态
	private String applicationTime;//客户申请时间
	private String cstate;//审核状态
	public Cmanagement() {
		super();
	}
	public Cmanagement(int customerID, String customerName, String loanInformation, String city, String phoneNum,
			int state, String applicationTime, String cstate) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.loanInformation = loanInformation;
		this.city = city;
		this.phoneNum = phoneNum;
		this.state = state;
		this.applicationTime = applicationTime;
		this.cstate = cstate;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getLoanInformation() {
		return loanInformation;
	}
	public void setLoanInformation(String loanInformation) {
		this.loanInformation = loanInformation;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getApplicationTime() {
		return applicationTime;
	}
	public void setApplicationTime(String applicationTime) {
		this.applicationTime = applicationTime;
	}
	public String getCstate() {
		return cstate;
	}
	public void setCstate(String cstate) {
		this.cstate = cstate;
	}
	@Override
	public String toString() {
		return "Cmanagement [customerID=" + customerID + ", customerName=" + customerName + ", loanInformation="
				+ loanInformation + ", city=" + city + ", phoneNum=" + phoneNum + ", state=" + state
				+ ", applicationTime=" + applicationTime + ", cstate=" + cstate + "]";
	}

	
}
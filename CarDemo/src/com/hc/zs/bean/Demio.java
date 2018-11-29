package com.hc.zs.bean;

import java.util.Date;
/**
 * 
 * @author ZS
 *
 */
public class Demio {//车系系统
	
	private int dID ;//车系Id
	private String amg;//车系名称
	private String money;//车系报价
	private Date dTime;//车系创建时间
	private String demperson;//车系创建人
	public Demio() {
		super();
	}
	public Demio(int dID, String amg, String money, Date dTime, String demperson) {
		super();
		this.dID = dID;
		this.amg = amg;
		this.money = money;
		this.dTime = dTime;
		this.demperson = demperson;
	}
	public int getdID() {
		return dID;
	}
	public void setdID(int dID) {
		this.dID = dID;
	}
	public String getAmg() {
		return amg;
	}
	public void setAmg(String amg) {
		this.amg = amg;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public Date getdTime() {
		return dTime;
	}
	public void setdTime(Date dTime) {
		this.dTime = dTime;
	}
	public String getDemperson() {
		return demperson;
	}
	public void setDemperson(String demperson) {
		this.demperson = demperson;
	}
	@Override
	public String toString() {
		return "Demio [dID=" + dID + ", amg=" + amg + ", money=" + money + ", dTime=" + dTime + ", demperson="
				+ demperson + "]";
	}

	
}

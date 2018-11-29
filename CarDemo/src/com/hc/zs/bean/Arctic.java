package com.hc.zs.bean;

import java.util.Date;
/**
 * 
 * @author ZS
 *
 */
public class Arctic {//车型系统
	
	private int cID ;//车型Id
	private String arctic;//车型名称
	private String cmoney;//车型指导价
	private String cTime;//车型创建时间
	private String arcperson;//车型创建人
	public Arctic() {
		super();
	}
	public Arctic(int cID, String arctic, String cmoney, String cTime, String arcperson) {
		super();
		this.cID = cID;
		this.arctic = arctic;
		this.cmoney = cmoney;
		this.cTime = cTime;
		this.arcperson = arcperson;
	}
	public int getcID() {
		return cID;
	}
	public void setcID(int cID) {
		this.cID = cID;
	}
	public String getArctic() {
		return arctic;
	}
	public void setArctic(String arctic) {
		this.arctic = arctic;
	}
	public String getCmoney() {
		return cmoney;
	}
	public void setCmoney(String cmoney) {
		this.cmoney = cmoney;
	}
	public String getcTime() {
		return cTime;
	}
	public void setcTime(String cTime ) {
		this.cTime = cTime ;
	}
	public String getArcperson() {
		return arcperson;
	}
	public void setArcperson(String arcperson) {
		this.arcperson = arcperson;
	}
	@Override
	public String toString() {
		return "Arctic [cID=" + cID + ", arctic=" + arctic + ", cmoney=" + cmoney + ", cTime=" + cTime + ", arcperson="
				+ arcperson + "]";
	}
	
}

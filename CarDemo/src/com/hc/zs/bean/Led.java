package com.hc.zs.bean;

import java.util.Date;
/**
 * 
 * @author ZS
 *
 */
public class Led {//故障灯管理系统
	
	private int lightid ;//故障灯ID
	private String title;//故障灯标题
	private String describe;//故障灯描述
	private String crestionTime;//车型创建时间
	private String creator;//车型创建人
	public Led() {
		super();
	}
	public Led(int lightid, String title, String describe, String crestionTime, String creator) {
		super();
		this.lightid = lightid;
		this.title = title;
		this.describe = describe;
		this.crestionTime = crestionTime;
		this.creator = creator;
	}
	public int getLightid() {
		return lightid;
	}
	public void setLightid(int lightid) {
		this.lightid = lightid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getCrestionTime() {
		return crestionTime;
	}
	public void setCrestionTime(String crestionTime) {
		this.crestionTime = crestionTime;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	@Override
	public String toString() {
		return "Led [lightid=" + lightid + ", title=" + title + ", describe=" + describe + ", crestionTime="
				+ crestionTime + ", creator=" + creator + "]";
	}
	
	
}

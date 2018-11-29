package com.hc.zs.bean;

public class CState {//客户管理状态

	private int stateID;//1  2
	private String cstate ;//1未处理   2已审核
	public CState() {
		super();
	}
	public CState(int stateID, String cstate) {
		super();
		this.stateID = stateID;
		this.cstate = cstate;
	}
	public int getStateID() {
		return stateID;
	}
	public void setStateID(int stateID) {
		this.stateID = stateID;
	}
	public String getCstate() {
		return cstate;
	}
	public void setCstate(String cstate) {
		this.cstate = cstate;
	}
	@Override
	public String toString() {
		return "CState [stateID=" + stateID + ", cstate=" + cstate + "]";
	}
	

}

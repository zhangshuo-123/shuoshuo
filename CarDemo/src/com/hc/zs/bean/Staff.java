package com.hc.zs.bean;
/**
 * 
 * @author ZS
 *
 */
public class Staff {//员工系统
	
		private int pID;//员工ID
		private String name;//员工名字                                                                        
		private String password;//登录密码
		private int section ;//员工部门
		private String Pname;//登录密码
		public Staff() {
			super();
		}
		public Staff(int pID, String name, String password, int section, String pname) {
			super();
			this.pID = pID;
			this.name = name;
			this.password = password;
			this.section = section;
			Pname = pname;
		}
		public int getpID() {
			return pID;
		}
		public void setpID(int pID) {
			this.pID = pID;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int getSection() {
			return section;
		}
		public void setSection(int section) {
			this.section = section;
		}
		public String getPname() {
			return Pname;
		}
		public void setPname(String pname) {
			Pname = pname;
		}
		@Override
		public String toString() {
			return "Staff [pID=" + pID + ", name=" + name + ", password=" + password + ", section=" + section
					+ ", Pname=" + Pname + "]";
		}
		
}
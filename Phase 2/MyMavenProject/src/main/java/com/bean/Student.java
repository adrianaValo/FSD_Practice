package com.bean;

public class Student {
	private int pid;
	private String pname;
	private String phone;
	private String email;
	private int batch;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int pid, String pname, String phone, String email, int batch) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.phone = phone;
		this.email = email;
		this.batch = batch;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
	@Override
	public String toString() {
		return "Student [pid=" + pid + ", pname=" + pname + ", phone=" + phone + ", email=" + email + ", batch=" + batch
				+ "]";
	}
	
	
}

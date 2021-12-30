package com.yuktisoftwares.ServerApp;

public class Student {
	private String name;
	private String enrollment;
	private String email;
	private String mobile;
	private String marks;
	
	
	public Student() {
		super();
	}
	public Student(String name, String enrollment, String email, String mobile, String marks) {
		super();
		this.name = name;
		this.enrollment = enrollment;
		this.email = email;
		this.mobile = mobile;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEnrollment() {
		return enrollment;
	}
	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobil) {
		this.mobile = mobile;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
}

package com.wipro.model;

public class Employee {
	
	private int id;
	private String firstname;
	private String department;
	private String workLocation;
	public Employee(int id, String firstname, String department, String workLocation) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.department = department;
		this.workLocation = workLocation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getWorkLocation() {
		return workLocation;
	}
	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}
	
	
	

}

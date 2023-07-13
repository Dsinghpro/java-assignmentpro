package com.diksha.model;

public class Department {
	private int deptNo;
	private String name;
	private String location;
	Employee[] employees;
	public Department() {}
	public Department(int deptNo, String name, String location, Employee[] employees) {
		super();
		this.deptNo = deptNo;
		this.name = name;
		this.location = location;
		this.employees = employees;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Employee[] getEmployees() {
		return employees;
	}
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	
	
}

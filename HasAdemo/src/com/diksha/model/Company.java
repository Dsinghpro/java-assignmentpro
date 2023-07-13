package com.diksha.model;

public class Company {
	private String name;
	private String location;
	Department[] department;
	public Company(String name, String location, Department[] department) {
		
		this.name = name;
		this.location = location;
		this.department = department;
	}
	public Company() {
		
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
	public Department[] getDepartment() {
		return department;
	}
	public void setDepartment(Department[] department) {
		this.department = department;
	}
	
}

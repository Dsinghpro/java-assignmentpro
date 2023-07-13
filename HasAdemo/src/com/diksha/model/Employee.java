package com.diksha.model;

public class Employee {
	int empId;
	String empName;
	double Salary;
	Address address;
	public Employee() {}
	public Employee(int empId, String empName, double salary, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		Salary = salary;
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public Address getAddress() {
		return address;//return address obj
	}
	public void setAddress(Address address) {
		this.address = address;//get the address obj
	}
	
}

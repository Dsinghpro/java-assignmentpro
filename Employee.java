package iostreamdemo;
import java.time.LocalDate;
import java.io.*;

public class Employee implements Serializable{
	private int empid;
	private String ename;
	transient private double salary;
	private LocalDate dob;
	public Employee() {}
	public Employee(int empid, String ename, double salary, LocalDate dob) {
		
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.dob = dob;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	
}

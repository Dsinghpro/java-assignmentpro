
public class Employee {
	private int empid;
	private String ename;
	private double salary;
	public Employee() {}
	public Employee(int empid, String ename, double salary) {
	
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}
	public String toString() {
		return empid+"  "+ename+" "+salary;
	}
	
}

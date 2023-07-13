class Employee extends Person{
	private int empid;
	private double salary;
	private String orgName;
	public Employee() {}
	public Employee(int ssn,String name,int age,int empid,double salary,String orgName) {
		super(ssn,name,age);
		this.empid=empid;
		this.salary=salary;
		this.orgName=orgName;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
}

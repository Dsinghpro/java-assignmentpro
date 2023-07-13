
 class SalesMan extends Employee{
	 private int points;
	 public SalesMan() {}
	 public SalesMan(int ssn,String name,int age,int empid,double salary,String orgName,int points) {
		super(ssn,name,age,empid,salary,orgName);
		this.points=points;
	 }
	 public int getPoints() {
		 return points;
	 }

}

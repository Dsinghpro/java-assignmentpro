class Test3{
	public static void main(String[] args) {
		SalesMan sm= new SalesMan(7001,"Ajay Saxena",34,5678,67000,"Abc Corp",9);
		System.out.println("ssn "+sm.getSsn());
		System.out.println("Name "+sm.getName());
		System.out.println("Age "+sm.getAge());
		System.out.println("EMpid "+sm.getEmpid());
		System.out.println("Salary "+sm.getSalary());
		System.out.println("Orgname "+sm.getOrgName());
		System.out.println("Total Salary"+(sm.getSalary()+sm.getPoints()*750));
		
	}
}


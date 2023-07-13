public class Person{
	  private int ssn;
	  private String name;
	  private int age;
	  public Person() {}
	  public Person(int ssn,String name,int age) {
		  this.ssn=ssn;
		  this.name=name;
		  if(age>=18)
			  this.age=age;
		  else
			  throw new InvalidAgeException("You are not 18 and above");
	  }
	  public void setSsn(int ssn) {
		  this.ssn=ssn;
	  }
	  public void setName(String name) {
		  this.name=name;
	  }
	  public void setAge(int age) {
		  this.age=age;
	  }
	public int getSsn() {
		return ssn;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	  
	  
}


class Student extends Person {
	private int rollNo;
	private String collegeName;
	private String Subject;
	public Student() {}
	public Student(int ssn,String name,int age,int rollNo,String collegeName,String Subject) {
		super(ssn,name,age);
		this.rollNo=rollNo;
		this.collegeName=collegeName;
		this.Subject=Subject;
		
		
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	
	
}

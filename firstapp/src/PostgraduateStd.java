
class PostgraduateStd extends Student {
	private String DegreeName;
	private int GPA;
	private int experience;
	public PostgraduateStd() {}
	public PostgraduateStd(int ssn,String name,int age,int rollNo,String collegeName,String Subject,String DegreeName,int GPA,int experience){
		super(ssn,name,age,rollNo,collegeName,Subject);

		this.DegreeName=DegreeName;
		this.GPA=GPA;
		this.experience=experience;	
	}
	public String getDegreeName() {
		return DegreeName;
	}
	public void setDegreeName(String degreeName) {
		DegreeName = degreeName;
	}
	public int getGPA() {
		return GPA;
	}
	public void setGPA(int gPA) {
		GPA = gPA;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}

}

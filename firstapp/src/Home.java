class Home extends Loan {
	public String Location;
	public double propertyValue;
	
	public Home() {}
	public Home(int tenure,double ROI,String Location,double propertyValue) {
		super(tenure,ROI);
		this.Location=Location;
		this.amount=propertyValue*0.9;
	}
	public double CalculateEMI() {
		return (this.amount+(this.amount*this.tenure*this.ROI)/100)/this.tenure;
	}

}

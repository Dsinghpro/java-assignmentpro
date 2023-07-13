
class Vehicle extends Loan{
	public double marketValue;
	public String category;
	public Vehicle() {}
	
	public Vehicle(int tenure,double ROI,double marketValue, String category) {
		super(tenure,ROI);
		this.amount = marketValue*0.9;
		this.category = category;
	}
	public double CalculateEMI() {
		return (this.amount+(this.amount*this.tenure*this.ROI)/100)/this.tenure;
	}

	

}

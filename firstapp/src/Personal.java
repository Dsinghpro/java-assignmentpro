
public class Personal extends Loan {
	public double income;
	public Personal() {}
	public Personal(int tenure,double ROI,double income) {
		super(tenure,ROI);
		this.amount = income*0.9;
		
	}


	public double CalculateEMI() {
		return (this.amount+(this.amount*this.tenure*this.ROI)/100)/this.tenure;
	}
}

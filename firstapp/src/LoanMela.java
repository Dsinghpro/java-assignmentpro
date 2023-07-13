

public class LoanMela {
	public static Loan approvalLoan() {
		switch(new java.util.Random().nextInt()%3) {
		case 0:
			return new Home(10,5,"Hyderabad",5000000);
		case 1:
			return new Vehicle(2,6,85000,"Private");
		default:
			return new Personal(5,8,400000);
		}
	}
}

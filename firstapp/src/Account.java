import java.time.LocalDate;
class Account {
	private int accountNumber;
	private double balance;
	private String accountHolderName;
	private LocalDate openedDate;
	public Account() {}
	public Account(int accountNumber,double balance,String accountHolderName,LocalDate openedDate) {
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.accountHolderName=accountHolderName;
		this.openedDate=openedDate;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Account) {
			Account a=(Account) obj;
			return (accountNumber==a.accountNumber && balance==a.balance && accountHolderName.equals(a.accountHolderName) &&  openedDate.equals(a.openedDate));
			
		}
		return false;
	}
	public String toString() {
//		return accountNumber+" "+ balance +" "+ accountHolderName + openedDate;
		return "Account Number" + accountNumber+"\nBalance "+ balance +"\nAccount Holder Name "+ accountHolderName +"\nOpened Date"+ openedDate;
	}
}

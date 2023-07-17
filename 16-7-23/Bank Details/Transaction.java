
public class Transaction extends Account{
    private char ttype;

   public Transaction(){}
    public Transaction(double accountNo,int openedDate,double balance,char ttype){
       super(accountNo,openedDate,balance);
       this.ttype=ttype;

    }
    public void deposit(Account account,double amount){
       account.setBalance(account.getBalance()+amount);

    }
    public String withdraw(Account account,double amount) throws RuntimeException{
       double balance=account.getBalance();

       if(balance-amount>=SavingAccount.minimumDepositAmount) {
    	   return balance-amount+" is rem balance";
       } else 
    	   throw new InsufficientBalanceException("Your accounts funds are not sufficient");
    }
   public boolean transForaccount(char ttype,Account account,double amount) {
	   switch(ttype) {
	   case 'd':
		   deposit( account, amount);
		   return true;
	   case 'w':
		   withdraw(account,amount);
	   default:
		   throw new RuntimeException("Invalid Transaction!!!");
	   }
	  
		   
   }




}
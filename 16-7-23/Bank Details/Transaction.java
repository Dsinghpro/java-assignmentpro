package Praticejava;

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
    public void withdraw(Account account,double amount){
       double balance=account.getBalance();

       if(balance-amount>=)
    }




}

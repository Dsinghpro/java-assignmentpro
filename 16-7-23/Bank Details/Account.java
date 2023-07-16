package Praticejava;

public class Account {
    private double accountNo;
    private int openedDate;
    private double balance;
    public Account(){}

    public Account(double accountNo,int openedDate,double balance) {
        this.accountNo=accountNo;
        this.openedDate=openedDate;
        this.balance = balance;
    }

    public double getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(double accountNo) {
        this.accountNo = accountNo;
    }

    public int getOpenedDate() {
        return openedDate;
    }

    public void setOpenedDate(int openedDate) {
        this.openedDate = openedDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

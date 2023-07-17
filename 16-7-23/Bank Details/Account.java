public class Account {
    private double accountNo;
    private int openedDate;
    private double balance;
    private int noOfTranscationPerDay=0;
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
    public boolean validatenoOfTranstionPerDay(){
        if(noOfTranscationPerDay<=10)
            return true;
        else
            throw new RuntimeException("You try to send money more than 10 times in one day");
    }
}
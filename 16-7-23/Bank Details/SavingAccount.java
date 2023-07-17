package Praticejava;

public class SavingAccount extends Account{
    private double minimumDepositAmount;
    private int noOfTranscationPerDay;
    public SavingAccount(){}
    public SavingAccount(double accountNo,int openedDate,double balance,double minimumDepositAmount,int noOfTranscationPerDay)
    {   super(accountNo,openedDate,balance);
        this.minimumDepositAmount =minimumDepositAmount;
        this.noOfTranscationPerDay=noOfTranscationPerDay;
    }

    public static double getMinimumDepositAmount() {
        return minimumDepositAmount;
    }

    public static void setMinimumDepositAmount(double minimumDepositAmount) {
        this.minimumDepositAmount = minimumDepositAmount;
    }

    public int getNoOfTranscationPerDay() {
        return noOfTranscationPerDay;
    }

    public void setNoOfTranscationPerDay(int noOfTranscationPerDay) {
        this.noOfTranscationPerDay = noOfTranscationPerDay;
    }

    public boolean validateminimumDeposit(double minimumDepositAmount){
        if(minimumDepositAmount >=2000)
            return true;
        else
            throw new RuntimeException("Required minimum balance of 2000");

    }
    public boolean validatenoOfTranstionPerDay(){
        if(noOfTranscationPerDay<=10)
            return true;
        else
            throw new RuntimeException("You try to send money more than 10 times in one day");
    }



}

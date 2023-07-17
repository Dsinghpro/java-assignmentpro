

public class SavingAccount extends Account{
    public static double minimumDepositAmount;
    private int noOfTranscationPerDay;
    public SavingAccount(){}
    public SavingAccount(double accountNo,int openedDate,double balance,double minimumDepositAmount,int noOfTranscationPerDay)
    {   super(accountNo,openedDate,balance);
        this.minimumDepositAmount =minimumDepositAmount;
        this.noOfTranscationPerDay=noOfTranscationPerDay;
    }

    public  double getMinimumDepositAmount() {
        return minimumDepositAmount;
    }

    public  void setMinimumDepositAmount(double minimumDepositAmount) {
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
   



}
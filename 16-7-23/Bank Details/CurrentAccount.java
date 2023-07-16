package Praticejava;

public class CurrentAccount extends Account{
    private double overDraftLimit;
    public CurrentAccount(){}
    public CurrentAccount(double accountNo,int openedDate,double balance,double overDraftLimit){
        super(accountNo,openedDate,balance);
        this.overDraftLimit=overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }
    public boolean validateOverDraftLimit(){
        if(overDraftLimit<=5)
            return true;
        else
            throw new RuntimeException("you have exceed your overdraftlimit");
    }
}

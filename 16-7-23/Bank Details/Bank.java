
public class Bank {
    private String bankName;
    private String branchName;
    private Account[] accounts;
    private int index=0;

    public Bank(){}
    public Bank(String bankName,String branchName,Account[] accounts){
        this.bankName=bankName;
        this.branchName=branchName;
        this.accounts=accounts;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    public boolean addAccount(Account account){
        if(index<accounts.length){
            accounts[index++]=account;
            return true;
        }
        throw new RuntimeException("No more account can be added");
    }
    public void showAccounts(){
        for(int i=0;i<index;i++){
            System.out.println(accounts[i].getAccountNo());
            System.out.println(accounts[i].getBalance());
            System.out.println(accounts[i].getOpenedDate());
        }
    }


}

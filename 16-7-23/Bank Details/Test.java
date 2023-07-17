
public class Test {
    public static void main(String[] args){
        Account[] accounts=null;
        Bank b=null;
        try{
            accounts=new Account[10];
            b=new Bank("Punjab National Bank","Alpha 2",accounts);
            accounts[0]=new SavingAccount(7476,14/11/1999,5000,2000,5);
            accounts[1]=new SavingAccount(7654,15/11/1999,3000,2000,8);
            accounts[3]=new CurrentAccount(45678,15/8/20,8000,2);
            b.showAccounts();
        }
        catch (RuntimeException ex){
            System.out.println(ex);
        }

    }

}
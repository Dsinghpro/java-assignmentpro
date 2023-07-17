import java.time.LocalDate;
public class Test {
    public static void main(String[] args){
        Account[] accounts=null;
        Bank b=null;
        try{
            accounts=new Account[10];
            b=new Bank("Punjab National Bank","Alpha 2",accounts);
            b.addAccount(new SavingAccount(7476,LocalDate.of(1999,11,21),5000,2000,5));
            b.addAccount(new SavingAccount(7654,LocalDate.of(2023, 7, 17),3000,2000,8));
            b.addAccount(new CurrentAccount(45678,LocalDate.of(2020, 11, 14),8000,2));
           
            b.showAccounts();
        }
        catch (RuntimeException ex){
            System.out.println(ex);
        }

    }

}

import java.util.Scanner;
class A{
	
}
class B extends A{
	
}
class C extends B{
	
}
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) //throws java.sql.SQLException
	{
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter First Number");
//		int a=sc.nextInt();
//		System.out.println("Enter the Second NUmber");
//		int b=sc.nextInt();
		//int[]x= {10,20,30};
		//try {
				//Utility.divide(a, b);
			//System.out.println(Utility.divide2(a, b));
			//Utility2.d();
//			System.out.println(a/b);
//			System.out.println(x[b]);//ArrayIndexOutBoundexception
			//System.out.println(Utility2.divide(a,b));
	//}
		//catch(ArithmeticException ex) {
			//System.out.println("Caught in Main");
			//ex.printStackTrace();
			//System.out.println("Invalid Division");
//			if(true)
//				return;
			//System.exit(1);
		//	System.out.println("Invalid Division");
			
			
		//}
//		catch(ArrayIndexOutOfBoundsException ex) {
//			System.out.println("Invalid Index");
////		}
//		finally {
//			System.out.println("From Finally Block");
//		}
		//dividing by 0 is abnormal situation
//		try {
//		Utility2.divide(10, 5);
//		}
//		catch(java.sql.SQLException ex) {
//			System.out.println(ex);
//		}
//		System.out.println("End");
//		
		/*int x=10,y=5;
		int[] a= {10,20,30};
		System.out.println("begin");
		try {
			System.out.println(x/y);
			System.out.println(a[y]);
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("End");*/
//		int x=10,y=2;
//		int[] a= {10,20,30};
//		System.out.println("begin");
//		int x=10 ,  y=5;
//		int[] a= {10,20,30};
//		
//		try {
//			System.out.println(x/y);
//			System.out.println(a[y]);
//		}
//		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException ex) {
//			System.out.println(ex);
//		}
//		catch(B ex) {
//			System.out.println(ex);
//		}
//		catch(A ex) {
//			System.out.println(ex);
//		}
//		catch(Exception ex) {//catch of type Exception is called Universal catch handler
//			System.out.println("caught by UCH"+ex);
//		}
//		Account a1=new Account(7001,"john miller",7500);
//		try {
//			Transaction.withdraw(a1, 6001);
//			
//		}
//		catch(InsufficientBalanceException ex) {
//			System.out.println(ex);
//		}
//		System.out.println("After the transaction your balance is :"+a1.getBalance());
//		
//		System.out.println("End");
		Person a=null;
		try {
			
			 a=new Person(7001,"Diksha",23);
			
		}
		catch(InvalidAgeException ex) {
			System.out.println(ex);
		}
		//System.out.println("After the transaction your balance is :"+a1.getBalance());
		System.out.println("your age :"+a.getAge());
		
	}
		

}

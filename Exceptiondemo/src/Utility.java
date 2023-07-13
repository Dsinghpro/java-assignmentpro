
public class Utility {
	public static void divide(int x,int y) {
		try {
			System.out.println(x/y);
		}
		catch(ArithmeticException ex) {
			System.out.println("Exception Handled in Divide");
			//ex.printStackTrace();
			throw ex;
		}
	}
	public static int divide2(int x,int y) {
		if(y!=0)
			return x/y;
		throw new ArithmeticException("Cant divide a number by zero");
	}
}

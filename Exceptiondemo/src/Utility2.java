
public class Utility2 {
//	public static void a() {
//		throw new ArithmeticException();
//		
//	}
//	public static void b() {
//		a();
//	}
//	public static void c() {
//		b();
//	}
//	
//	public static void d() {
//		c();
//	}
	public static void divide(int x,int y) throws java.sql.SQLException {
		if(y!=0)
			System.out.println(x/y);
//		throw new ArithmeticException();
		else {
//		try {
//		throw new java.sql.SQLException();
//	}
//		catch(java.sql.SQLException ex) {
//			System.out.println("Invalid Division");
//		}
//		}
			throw new java.sql.SQLException();
		}
}
}


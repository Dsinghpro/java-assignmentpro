public class Test4 {

	public static void main(String[] args) {
		F f1=new F();
		f1.message();
		f1.message();
	}

}
class E{
	
	public void message() {
		System.out.println("E created");
	}
}
class F extends E{
	
	public void message() {
		System.out.println("F created");
	}
}
//class C extends F{
//	int z=30;
//	public C() {
//		System.out.println("C created");
//	}
//}

class A{
//	private int x;
//	public void setX(int x) {
//		this.x=x;
//	}
//	public int getX() {
//		return x;
//	}
	int x=10;
}
class B extends A{
	
	int x=20;
//	public B() {}
//	public void setB(int x,int y) {
//		setX(x);
//		this.x=x;//this calls super class's default constructor
//		this.y=y;//and call to super class constructor should be the very first
//		        //statement inside the sub class constructor
//		
//	}
	public void showB() {
		System.out.println("parent x="+super.x);
		System.out.println("child x="+x);
	}//super is also implicit reference variable similar to this but it refers  only super class part
	
}
public class Test2 {
	public static void main(String[] args) {
		B b1=new B();
//		b1.setB(786, 999);
		b1.showB();
		
	}
}

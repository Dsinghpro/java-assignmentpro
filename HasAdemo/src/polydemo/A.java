package polydemo;

public class A {
	int x=10;
	public void show() {
		System.out.println("From A");
	}
}
class B extends A{
	int y=20;
	public void show() {
		System.out.println("From B");
	}
}
class C extends A{
	int z=30;
	public void show() {
		System.out.println("From C");
	}
}


public class Stack {
	private Object[] a;
	private int index=-1;
	public Stack(Object[] a) {
		this.a=a;
		}
	private boolean isFull() {
		return index==9;
	}
	private boolean isEmpty() {
		return index ==-1;
	}
	public void push(Object element) {
		if(!isFull())
			a[++index]=element;
		else
			throw new RuntimeException("Stack Overflow :-No more elements can be added");
		
	}
	public Object pop() {
		if(!isEmpty()) {
			return a[index--];
		}
		throw new RuntimeException("Stack Underflow");
	}
}
class Main{
	public static void main(String[] args) {
		Stack s=new Stack(new Integer[10]);
		for(int i=1;i<=10;i++)
			s.push(i*10);
		for(int i=1;i<=10;i++)
			System.out.println(s.pop());
		
		Stack s2=new Stack(new String[10]);
		for(int i=1;i<=10;i++)
			s2.push("Welcome"+i);
		for(int i=1;i<=10;i++)
			System.out.println(s2.pop());
		
	}
}

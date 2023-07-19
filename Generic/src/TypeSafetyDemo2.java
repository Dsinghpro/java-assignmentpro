
/*public class TypeSafetyDemo2 {
	public static <T extends Number>double getAverage(T[] a){
		double sum=0.0;
		for(int i=0;i<a.length;i++)
			sum=sum + a[i].doubleValue();
		return sum/a.length;
	}
}
class Test0{
	public static void main(String[] args) {
		System.out.println(TypeSafetyDemo2.getAverage(new Integer[] {10,20,30,40,50}));
		System.out.println(TypeSafetyDemo2.getAverage(new Double[] {10.00,45.9,30.34,67.87,50.23}));
		//System.out.println(TypeSafetyDemo2.getAverage(new String[] {"aaaa","bbb","ccccc"}));
		
	}
}*/
/*public class TypeSafetyDemo2 <T extends Number> {
	T[] a;
	public TypeSafetyDemo2(T[] a) {
		this.a=a;
	}
	public double getAverage(){
		double sum=0.0;
		for(int i=0;i<a.length;i++)
			sum=sum + a[i].doubleValue();
		return sum/a.length;
	}
	public boolean areAvgSame(TypeSafetyDemo2<?> ts) {
		return getAverage() ==ts.getAverage();
	}
}
class Test0{
	public static void main(String[] args) {
		TypeSafetyDemo2<Integer> ts1=new TypeSafetyDemo2<Integer>(new Integer[] {10,20,30,40,50});
		System.out.println(ts1.getAverage());
		TypeSafetyDemo2<Double> ts2=new TypeSafetyDemo2<Double>(new Double[] {10.00,20.00,30.00,40.00,50.00});
		System.out.println(ts2.getAverage());
		
		System.out.println(ts1.areAvgSame(ts2));
		
		
	}
}*/


//Generic super class & sub class
//Generic Sub class
/*public class TypeSafetyDemo2 <T> {
	T[] a;
	int index=-1;
	public TypeSafetyDemo2(T[] a) {
		this.a=a;
	}
	
	
	public boolean isEmpty() {
		return index==-1;
	}
	public boolean isFull() {
		return index==9;
	}
}
class MyStack<T> extends TypeSafetyDemo2<T>{
	public MyStack(T[] a) {
		super(a);
	}
	public void push(T element) {
		if(!isFull())
			a[++index]=element;
		else
			throw new RuntimeException("Stack overflow");
	}
	public T pop() {
		if(!isEmpty()) {
			return a[index--];
		}
		throw new RuntimeException("Stack underflow");
	}
}
class Test0{
	public static void main(String[] args) {
		
		MyStack<Integer> ms=new MyStack<Integer>(new Integer[10]);
		for(int i=1;i<=10;i++)
			ms.push(i);
		for(int i=1;i<=10;i++)
			System.out.println(ms.pop());
		
	}
}*/

//specific sub class
public class TypeSafetyDemo2 <T> {
	T[] a;
	int index=-1;
	public TypeSafetyDemo2(T[] a) {
		this.a=a;
	}
	
	
	public boolean isEmpty() {
		return index==-1;
	}
	public boolean isFull() {
		return index==9;
	}
}
class MyStack extends TypeSafetyDemo2<Double>{
	public MyStack(Double[] a) {
		super(a);
	}
	public void push(Double element) {
		if(!isFull())
			a[++index]=element;
		else
			throw new RuntimeException("Stack overflow");
	}
	public Double pop() {
		if(!isEmpty()) {
			return a[index--];
		}
		throw new RuntimeException("Stack underflow");
	}
}
class Test0{
	public static void main(String[] args) {
		
		MyStack ms=new MyStack(new Double[10]);
		for(int i=1;i<=10;i++)
			ms.push(i*2.5);
		for(int i=1;i<=10;i++)
			System.out.println(ms.pop());
		
	}
}




public class GenStack<T,U> {
	
	
	/*private T[] a;
	private int index=-1;
	public GenStack(T[] a) {
		this.a=a;
		}
	private boolean isFull() {
		return index==9;
	}
	private boolean isEmpty() {
		return index ==-1;
	}
	public void push(T element) {
		if(!isFull())
			a[++index]=element;
		else
			throw new RuntimeException("Stack Overflow :-No more elements can be added");
		
	}
	public T pop() {
		if(!isEmpty()) {
			return a[index--];
		}
		throw new RuntimeException("Stack Underflow");
	}*/
	T obj1;
	U obj2;
	public GenStack(T obj,U obj2){
		this.obj1=obj;
		this.obj2=obj2;
	}
	public T getObj1() {
		return obj1;
	}
	public U getObj2() {
		return obj2;
	}
}

class Test8{
	public static void main(String[] args) {
//		GenStack<Employee> es=new GenStack<Employee>(new Employee[10]);
		
//		for(int i=1;i<=10;i++)
//			ss.push("Hello"+i);
//		for(int i=1;i<+10;i++)
//			System.out.println(ss.pop());
//		GenStack<Double> ds=new GenStack<Double>(new Double[10]);
//		for(int i=1;i<=10;i++)
//			ds.push(2.5*i);
//		for(int i=1;i<+10;i++)
//			System.out.println(ds.pop());
//		es.push(new Employee(104,"Dinesh",4000));
//		es.push(new Employee(105,"Babu",3000));
//		es.push(new Employee(106,"Ajay",5000));
//		es.push(new Employee(107,"Diksha",9000));
//		es.push(new Employee(108,"riya",7000));
//		for(int i=1;i<=10;i++) {
//			System.out.println(es.pop());
		GenStack<String,Employee> ts=new GenStack<String,Employee>("Marketing",new Employee(104,"Dinesh",75000));
		System.out.println(ts.getObj1()+"  "+ts.getObj2());
		}
		
	}


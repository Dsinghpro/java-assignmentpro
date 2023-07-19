
/*interface GenericsDemo<T>{
	void printArray(T[] a);
}
class GenDemoImpl<T> implements GenericsDemo<T>{
	

	public void printArray(T[] a) {
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}
class Check{
	public static void main(String[] args) {
		GenDemoImpl<String> gd1=new GenDemoImpl<String>();
		gd1.printArray(new String[] {"Welcome","Hello","Bye Bye"});
		Employee[] earr= {new Employee(102,"Babu",2000),new Employee(103,"Ajay",3000),new Employee(105,"Charan",6000)};
		GenDemoImpl<Employee> gd2=new GenDemoImpl<Employee>();
		gd2.printArray(earr);
	}
}*/

/*interface GenericsDemo<T>{
	void printArray(T[] a);
}
class GenDemoString implements GenericsDemo<String>{
	

	public void printArray(String[] a) {
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}
class GenDemoEmployee implements GenericsDemo<Employee>{
	

	public void printArray(Employee[] a) {
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}
class Check{
	public static void main(String[] args) {
		GenDemoString gd1=new GenDemoString();
		gd1.printArray(new String[] {"Welcome","Hello","Bye Bye"});
		Employee[] earr= {new Employee(102,"Babu",2000),new Employee(103,"Ajay",3000),new Employee(105,"Charan",6000)};
		GenDemoEmployee gd2=new GenDemoEmployee();
		gd2.printArray(earr);
	}
}*/
/*
class GenericsDemo<T>{
	//T is replace by object
	Object a;

	public GenericsDemo(Object a) {
		
		this.a = a;
	}
	public Object getObject() {
		return a;
	}
}
class Check{
	public static void main(String[] args) {
		GenericsDemo<Integer> gd= new GenericsDemo<Integer>(new Integer(100));
		
		Integer i=(Integer) gd.getObject();
	}
}*/
//Erasure
//class GenericsDemo <T extends Number>
/*class GenericsDemo<T>{
	
	Number a;

	public GenericsDemo(Number a) {
		
		this.a = a;
	}
	public Number getObject() {
		return a;
	}
}
class Check{
	public static void main(String[] args) {
		GenericsDemo<Integer> gd= new GenericsDemo<Integer>(new Integer(100));
		
		Integer i=(Integer) gd.getObject();
	}
}*/

class GenericsDemo<T>{
	
	T a;

	public GenericsDemo(T a) {
		
		this.a = a;
	}
	public T getObject() {
		return a;
	}
}
class Check{
	public static void main(String[] args) {
		//GenericsDemo gd=new GenericsDemo(new Integer(10));//Raw type
		GenericsDemo<Integer> gd=new GenericsDemo<>(new Integer(10));//Type inference
		System.out.println(gd.getObject());
		//String s=(String)gd.getObject();
	}
}



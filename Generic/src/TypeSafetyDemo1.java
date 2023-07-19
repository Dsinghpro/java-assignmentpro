
public class TypeSafetyDemo1 {
	//public <T> void printArray(T[] a) 
	public static<T> void printArray(T[] a){
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
class TestT{
	public static void main(String[] args) {
		Integer[] i= {10,20,30,40,50};
		String[] s= {"Welcome","Hello","Farewel"};
		//TypeSafetyDemo1 ts=  new TypeSafetyDemo1();
//		ts.printArray(i);
//		ts.printArray(s);
//		ts.printArray(new Employee[] {new Employee(102,"Dinesh",2000),new Employee(107,"Ajay",10000)});
		TypeSafetyDemo1.printArray(i);
		TypeSafetyDemo1.printArray(s);
		TypeSafetyDemo1.printArray(new Employee[] {new Employee(102,"Dinesh",2000),new Employee(107,"Ajay",10000)});
	}
}

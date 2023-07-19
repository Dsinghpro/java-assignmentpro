
public class TypeSafetyDemo<T> {
	//T is a generic Type
	T obj;
	public TypeSafetyDemo(T obj)
	{
		this.obj=obj;
	}
	public T getObject()
	{
		return obj;
	}
	
		
	}

class Test7{
	public static void main(String[] args) {
		//TypeSafetyDemo ts1= new TypeSafetyDemo(new Integer(10));
		//System.out.println(ts1.getObject());
		
//		TypeSafetyDemo ts2= new TypeSafetyDemo(new String("Welcome Diksha"));
//		String s=(String) ts2.getObject();
//		System.out.println(s);
		
		//Integer i=(Integer) ts2.getObject();
//		TypeSafetyDemo<Integer> ts1=new TypeSafetyDemo<Integer>(new Integer(786));
//		System.out.println(ts1.getObject());		
		TypeSafetyDemo<String> ts2=new TypeSafetyDemo<String>(new String("Welcome to Generic"));
		//Integer s=ts2.getObject();
		System.out.println(ts2.getObject());
	}
}

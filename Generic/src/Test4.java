
public class Test4 {
	public static void main(String[] args) {
		//Integer iobj1=new Integer(10);
//		int x=20;
//		Integer iobj2=new Integer(x);
//		Integer iobj3=Integer.valueOf(30);
//		int a=iobj1.intValue();
//		float b=iobj1.floatValue();
//		double c=iobj1.doubleValue();
//		System.out.println(a+" "+b+" "+c);
//		
//		int a=iobj1.intValue();//unboxing
//		int b=iobj2.intValue();
//		int c=iobj3.intValue();
//		System.out.println(a+" "+b+" "+c);
		//Double dobj=new Double(9999999999999999.99);
		//int x=dobj.intValue();
//		Integer iobj=100;  //autoboxing
//		System.out.println(iobj); //autounboxing
		String s="100";
		int x=Integer.parseInt(s);
		System.out.println(x+100);
		
		s=new String("786.45");
		double d=Double.parseDouble(s);
		System.out.println(d);
		}
}

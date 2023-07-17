package iostreamdemo;
import java.io.*;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
//		Employee e1=new Employee(101,"Ajay",25000,LocalDate.of(2000, 10, 30));
//		FileOutputStream fos=null;
//		ObjectOutputStream oos=null;
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
//			fos=new FileOutputStream("c:\\users\\DSingh\\Desktop\\emp.dat");
//			oos=new ObjectOutputStream(fos);
//			oos.writeObject(e1);
//			oos.close();
//			fos.close();
			fis=new FileInputStream("c:\\users\\DSingh\\Desktop\\emp.dat");
			ois=new ObjectInputStream(fis);
			Employee e=(Employee)ois.readObject();
			System.out.println(e.getEmpid()+"   "+e.getEname());
			System.out.println(e.getSalary()+"    "+e.getDob());
			ois.close();
			fis.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}

package iostreamdemo;

//import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileWriter;


public class Demo {
	public static void main(String[] args) throws IOException{
//		File file= new File("C:\\Users\\DSingh\\eclipse-workspace\\Assignment");
//		System.out.println(file.getName());
//		System.out.println(file.getParent());
//		System.out.println(file.length());
//		System.out.println("File "+file.isFile());
//		System.out.println("Directory  "+file.isDirectory());
//		System.out.println("executable  " +file.canExecute());
		//int ch;
//		try(FileInputStream fin=new FileInputStream("C:\\Users\\DSingh\\Desktop\\Notepad\\New Text Document.txt")){
//			while((ch=fin.read())!=-1)
//				System.out.print((char)ch);
//			//fin.close();
//			
//		}
//		catch(IOException ex) {
//			System.out.println(ex);
//		}
//		FileOutputStream fos=null;
//		BufferedOutputStream bos=null;
//		FileWriter fos=null;
//		BufferedWriter bos=null;
//		
//		try {
//			fos=new FileOutputStream("c:\\users\\DSingh\\Desktop\\abc.txt",true);
//			bos=new BufferedOutputStream(fos,500);
//			fos=new FileWriter("c:\\users\\DSingh\\Desktop\\abc.txt",true);
//			bos=new BufferedWriter(fos,500);
//			//FileWriter fos = new FileWriter("c:\\users\\DSingh\\Desktop\\abc.txt",true);
//			for(int i=65;i<=90;i++)//if we edit this the file will be created as new one and previous content will be deleted
//				bos.write(i);
//			fos.close();
//			bos.close();
//			//by writing true the previous content will not delete
//		}
//		catch(IOException ex) {
//			System.out.println(ex);
//		}
//		DataOutputStream dos=null;
//		FileOutputStream fos=null;
		DataInputStream dis=null;
		FileInputStream fos=null;
		int i;
		long l;
		float f;
		double d;
		
		try {
			fos=new FileInputStream("c:\\users\\DSingh\\Desktop\\abc.txt");
			dis=new DataInputStream(fos);
//			dos.writeInt(i);
//			dos.writeLong( l);
//			dos.writeFloat(f);
//			dos.writeDouble(d);
			i=dis.readInt();
			l=dis.readLong();
			f=dis.readFloat();
			d=dis.readDouble();
			System.out.println(i+"    "+l);
			System.out.println(f+"   "+d);
			dis.close();
			fos.close();
			
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
	
	}

}

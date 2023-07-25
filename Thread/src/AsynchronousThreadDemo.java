class Printer{
	synchronized void print(String[] messages) {//Adding synchronized made it in synchronization
		for(String m:messages)
			System.out.print(m+" ");
		System.out.println();
	}
}
class ChildThread1 implements Runnable{
	Thread t;
	Printer p;
	String[] messages;
	public ChildThread1(Printer p,  String[] messages) {
		t=new Thread(this);
		this.p=p;
		this.messages=messages;
		t.start();
		
	}
	public void run() {
		p.print(messages);
	}
	
}

public class AsynchronousThreadDemo {
	public static void main(String[] args) {
		Printer printer =new Printer();
		ChildThread1 p1=new ChildThread1(printer,new String[] {"Hello","Welcome","ByeBye"});
		ChildThread1 p2=new ChildThread1(printer,new String[] {"Ball","Apple","Boy"});
		ChildThread1 p3=new ChildThread1(printer,new String[] {"Delhi","Vadodara","Hyd"});
		
		
			
		
		try {
			p1.t.join();
			p2.t.join();
			p3.t.join();
		}
		catch(InterruptedException ex) {
			System.out.println(ex);
		}
		
		System.out.println("Main is Terminating");
	}
	
}

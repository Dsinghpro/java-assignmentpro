class Queue{
	int element;
	boolean flag =false;
	synchronized public void read() {
		if(!flag) {
			System.out.println("Read   :"+element);
			flag=true;
			notify();
		}
		try {
			wait();
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
	}
	synchronized public void write(int n) {
		if(flag) {
			this.element =n;
			System.out.println("Written  :"+n);
			flag=false;
			notify();
		}
		try {
			wait();
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
class ReadThread implements Runnable{
	Thread t;
	Queue q;
	public ReadThread(Queue q) {
		
		t=new Thread(this);
		this.q=q;
		t.start();
	}
	
	public void run() {
		while(true)
			q.read();
		
	}
	
}
class WriteThread implements Runnable{
	Thread t;
	Queue q;
	public WriteThread(Queue q) {
		
		t=new Thread(this);
		this.q=q;
		t.start();
	}
	
	public void run() {
		int n=1;
		while(true)
			q.write(n++);
		
	}
	
}
public class InterThreacCom {
	public static void main(String[] args) {
		Queue queue=new Queue();
		ReadThread rt=new ReadThread(queue);
		WriteThread wt =new WriteThread(queue);
		try {
			rt.t.join();
			wt.t.join();
		}
		catch(InterruptedException ex) {
			System.out.println(ex);
		}
	}
}

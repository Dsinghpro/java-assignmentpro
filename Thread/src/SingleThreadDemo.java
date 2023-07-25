/*class SecondThread extends Thread{
	
	public SecondThread() {
		start();
		
	}
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("Second Loop " + i);
		}
		
	}
}*/





/*class ChildThread implements Runnable{
	Thread t;
	public ChildThread() {
		t=new Thread(this);
		t.start();
		
	}
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("Child Loop " + i);
			System.out.println("Child is Terminating");
		}
		
		
	}
}*/

/*class ChildThread implements Runnable{
	Thread t;
	public ChildThread(String name) {
		t=new Thread(this,name);
		t.start();
		
	}
	public void run() {
		try {
			for(int i=1;i<=10;i++) {
				System.out.println(t.getName( )+"  " + i);
				t.sleep(1000);
				
			}
			
		}catch(InterruptedException ex) {
			System.out.println(ex);
		}
		
		System.out.println(t.getName() + " is Terminating");
		
		
	}
}*/

//High priority or low priority thread
class ChildThread implements Runnable{
	Thread t;
	int priority;
	boolean flag=true;
	volatile long x=0;//Code optimization//if other thread wants to access they will get the updated value
	public ChildThread(String name,int priority) {
		t=new Thread(this,name);
		t.setPriority(priority);
		t.start();
		
	}
	public void run() {
		while(flag)
			x++;
		System.out.println(t.getName() + " is Terminating");	
	}
	public void stop() {
		flag=false;//when flag is false loop terminate
	}
}


public class SingleThreadDemo {
	public static void main(String[] args) {
//		Thread t=Thread.currentThread();//returns the reference of current(main thread in this case) thread
//		System.out.println(t.getName());
//		System.out.println(t.getPriority());
//		System.out.println(t.getThreadGroup());
//		t.setName("FirstThread");
//		t.setPriority(8);
//		System.out.println(t.getName());
//		System.out.println(t.getPriority());
//		ChildThread ct1=new ChildThread("First Child");
//		ChildThread ct2=new ChildThread("Second Child");
//		for(int i=1;i<=100;i++) {
//			System.out.println("Main Loop " + i);
		//}
		ChildThread hpt=new ChildThread("HP Child",8);
		ChildThread lpt=new ChildThread("LP Child",3);
		
		try {
			Thread.sleep(3000);
				
		}
		catch(InterruptedException ex) {
			System.out.println(ex);
		}
		hpt.stop();
		lpt.stop();
			
		
		try {
			hpt.t.join();
			lpt.t.join();
		}
		catch(InterruptedException ex) {
			System.out.println(ex);
		}
		System.out.println("HPT executed for"+hpt.x);
		System.out.println("LPT executed for"+lpt.x);
		System.out.println("Main is Terminating");
		
		
//		System.out.println(Thread.MIN_PRIORITY);
//		System.out.println(Thread.NORM_PRIORITY);
//		System.out.println(Thread.MAX_PRIORITY);
		//Another approach
//		Thread ct1 =new Thread(new SecondThread());
//		ct1.start();
//		for(int i=1;i<=100;i++)
//			System.out.println("First loop"+i);
//		SecondThread is the child of main Thread
	}
}

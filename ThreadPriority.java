package test;

public class ThreadPriority extends Thread {

	public void run()
	{
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		//System.out.println(Thread.currentThread().getId());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadPriority t1= new ThreadPriority();
		ThreadPriority t2= new ThreadPriority();
		t1.setName("low priority");
		t2.setName("high priority");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}

}

package test;

public class ThreadMethods implements Runnable{

	public void run()
	{
		System.out.println("r1");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("r2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadMethods  t1= new ThreadMethods();
		ThreadMethods  t2= new ThreadMethods();
		Thread t3= new Thread(t1);
		Thread t4= new Thread(t2);
		t3.start();
		try {
			t3.join(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t4.start();
		System.out.println(t3.isAlive());
		System.out.println(t4.isAlive());
	}

}

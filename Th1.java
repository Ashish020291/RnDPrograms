package test;

public class Th1 implements Runnable{
	public void run()
	{
		int j=1;
		System.out.println("runnabme thread1" + Thread.currentThread());
		for(int i=1; i<=10; i++)
		{
			System.out.println(j=i*2);
		}
	}
	public static void main(String arg[])
	{
		Th1 t1= new Th1();
		Th1 t2= new Th1();
		Thread t3= new Thread(t1);
		t3.setName("firstthread");
		t3.start();
		t3.setPriority(5);
	
		Thread t4= new Thread(t2);
		t4.setName("2nd thread");
		t4.setPriority(9);
		t4.start();
		
	}

}

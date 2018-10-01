package test;

public class Th2 extends Thread{

	
		// TODO Auto-generated method stub
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
		Th2 t1=new Th2();
		t1.start();
		t1.setName("1st");
		t1.setPriority(1);
		
		
		Th2 t2= new Th2();
		t2.start();
		t2.setName("2nd");
		t2.setPriority(10);
		}

	}


package test;

/*
class sample1 extends Thread
{
	@Override
	public void run() {
		//single task multiple threads
		System.out.println("task 1"); 
		
	}
}
class sample2 extends Thread
{
	@Override
	public void run() {
		//single task multiple threads
		System.out.println("task 2"); 
		
	}
}
*/
public class TestMultitasking1  {

	public static void main(String[] args)
	{
/*single task multiple threads
Thread t1= new Thread(new TestMultitasking1());
Thread t2= new Thread(new TestMultitasking1());
t1.start();
t2.start();
*/
		/*sample1 s1= new sample1();
		sample2 s2= new sample2();
		s2.start();
		s1.start();*/
		
	Runnable r1= new Runnable() {
		
		@Override
		public void run() {
			System.out.println("test1");
			
		}
	};	
	
Runnable r2= new Runnable() {
		
		@Override
		public void run() {
			System.out.println("test2");
			
		}
	};
Thread t1= new Thread(r1);
Thread t2= new Thread(r2);
t1.start();
t2.start();
		
	}

/*	@Override
	public void run() {
		//single task multiple threads
		System.out.println("task 1"); 
		
	}*/

}

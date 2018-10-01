package test;

public class Staticsynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mythread1 t1 = new Mythread1();
		Mythread2 t2= new Mythread2();
		Mythread3 t3=new Mythread3();
		t1.start();
		t2.start();
		t3.start();
	}

}
class Mythread1 extends Thread
{
	
	public void run()
	{
		Table_t.printtable(5);
	}
}

class Mythread2 extends Thread
{

	
	public void run()
	{
		Table_t.printtable(15);
	}
}


class Mythread3 extends Thread
{
	public void run()
	{
		Table_t.printtable(5);
	}
}
class Table_t extends Thread
{
	synchronized static void printtable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
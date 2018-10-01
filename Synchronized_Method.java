package test;

public class Synchronized_Method {
	public static void main(String args[])
	{
		final Table t= new Table();
		Thread t1= new Thread() {
			public void run()
			{
			t.printtable(5);	
			}
		};
		Thread t2= new Thread() {
			public void run()
			{
			t.printtable(10);	
			}
		};
		t1.start();
		t2.start();
	}

}


class Table
{
	synchronized public void printtable(int n)
	{
	for(int i=1;i<=n;i++)
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
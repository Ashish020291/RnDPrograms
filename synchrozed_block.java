package test;

public class synchrozed_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table1 t1= new Table1();
		// TODO Auto-generated method stub
		Table1 t5= new Table1();
		Thread1 t2= new Thread1(t1);
		Thread2 t3= new Thread2(t1);
		Thread1 t6= new Thread1(t5);
		t6.start();
		t2.start();
		t3.start();
	}

}

class Thread1 extends Thread
{
	Table1 t;
	public Thread1(Table1 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printtable(5);
	}
}

class Thread2 extends Thread
{
	Table1 t;
	public Thread2(Table1 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printtable(20);
	}
}

class Table1{
	
	public void printtable(int n) {
	synchronized (this)
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(n*i);
		}
	}
	}
	
}
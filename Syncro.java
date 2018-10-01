package test;


class First{
	public void display(String str)
	{
		System.out.println("[" + str);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class Second extends Thread
{
	String msg; First f;
	Second(String str,First obj)
	{
		msg=str;
		f=obj;
		start();
	}
	public void run()
	{
		synchronized (f) {
		f.display(msg);
	}
	}
	
}

public class Syncro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First f= new First();
		Second s1= new Second("welcome", f);
		Second s2= new Second("new", f);
		Second s3= new Second("programmer", f);
	}

}

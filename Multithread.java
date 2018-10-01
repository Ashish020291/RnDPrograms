package test;

public class Multithread extends Thread{

	public void run()
	{
		System.out.println("thread");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multithread m= new Multithread();
		//Thread t= new Thread(m);
		//t.start();
		m.start();
	}

}

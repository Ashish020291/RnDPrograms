package test;

import java.io.IOException;

public class ChainedException {
	
	
	
public static void divide(int a,int b)
{
	
	if(b==0)
	{
		
		ArithmeticException ae= new ArithmeticException("top layer");
		ae.initCause(new IOException("cause"));
		throw  ae;
		
	}
	else
	{
		System.out.println(a/b);
	}
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			divide(10,0);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
			System.out.println(e.getCause());
			
		}

	}

}

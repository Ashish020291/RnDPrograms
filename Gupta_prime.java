package test;

public class Gupta_prime {

	 int  num=4;
	 boolean flag=true;
	
	public void prime(int x)
	{
		if(x>=2)
		{
		for(int i=2;i < num-1; i++)
		{
			if (num%i==0)
			{
				flag=false;
				break;
			}
			
		}
		if(flag==true)
		{
			System.out.println("number is prime");
		}
		else if(flag==false)
		{
			System.out.println("number is not prime");
		}
		
	}
		else
		{
			System.out.println ("please enter number greater or equal to 2");
		}
	}
	public static void main(String[] args) {
		Gupta_prime p= new Gupta_prime();
     p.prime(p.num);
         
		
	}

}

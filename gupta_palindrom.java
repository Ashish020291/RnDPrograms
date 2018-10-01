package test;

public class gupta_palindrom {

	int number=121,rev=0;
	public void palindrom(int num,gupta_palindrom o)
	{
		while(num!=0)
		{
			rev=rev*10; //0,10
			rev=rev + (num%10); //1,12
			num=num/10; //12,1
		}
		System.out.println( "original num =" + o.number );
		System.out.println( "reverse of num =" +rev);
		if(o.number==rev)
		{
			System.out.println("number is palindrom");
		}
		else
		{
			System.out.println("number is not palindrom");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gupta_palindrom p= new gupta_palindrom();
		p.palindrom(p.number,p);
	}

}

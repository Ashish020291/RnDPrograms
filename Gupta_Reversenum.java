package test;

public class Gupta_Reversenum {
	int num=951;int rem=0;int rev=0;
	public static int revnum(int n,int rev)
	{
		do
		{
			rev=rev*10; //0,10,150
			rev=rev+n%10; //1,15,159
			n=n/10; //95,9.5,0
		}while(n!=0);
		
		return rev;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gupta_Reversenum ob= new Gupta_Reversenum();
        int rev= revnum(ob.num,ob.rem);
        System.out.println("revese of num is = " +rev);
	}

}

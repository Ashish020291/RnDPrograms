package test;

public class Gupta_reverse {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orig= "ashish",rev="";
		int l=orig.length();
		
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+orig.charAt(i);
		}
		//System.out.println("reverse of string = " + rev);
		//System.out.println("original of string = " + orig);
		if(orig.equals(rev))
		{
			System.out.println("string is palindrom");
		}
		else
		{
			System.out.println("string is not palindrom");
		}
		
		//palindrom via string buffer
		
		System.out.println("**************palindrom via string buffer************");
		String o= "madam";
		String r= new StringBuffer(o).reverse().toString();
		System.out.println("revese using buffer= " +r);
		if(o.equals(r))
		{
			System.out.println("verified via buffer string is palindom");
		}
		else
		{
			System.out.println("verified via buffer string is not palindom");
		}
	}	
	
}

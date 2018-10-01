package test;

import java.util.Scanner;

public class revstr {
public static void main(String arg[])
{
	String str,rev="";
	System.out.println("enter string");
	Scanner scr= new Scanner(System.in);
	
	str=scr.nextLine();
	int len=str.length();
	
	for(int i=len-1;i>=0;i--)
	{
		
		rev=rev+str.charAt(i);
	}
	System.out.println("reverse string is = " + rev);
	StringBuffer buf= new StringBuffer("dad");
	StringBuffer rev2;
	rev2=buf.reverse();
	System.out.println(rev2);
	
	if (str.equalsIgnoreCase(rev))
	{
		System.out.println("string is palindrom");
	}
	else
	{
		System.out.println("string is not palindrom");
	}
}

}

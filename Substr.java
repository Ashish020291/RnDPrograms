package test;

import java.util.Scanner;

public class Substr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str,substr;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any string");
		str=sc.nextLine();
		int len=str.length();
		
		for(int i=0;i<len;i++)
		{
			for(int j=1;j<=len-i;j++)
			{
				substr=str.substring(i, i+j);
				System.out.println( "substring = "+ substr);
			}
		}
		
	}

}

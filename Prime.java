package test;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
System.out.println("enter number = ");
Scanner in= new Scanner(System.in);
num=in.nextInt();
boolean flag=false;
for(int i=2;i<num;i++)
{
	if(num%i==0)
	{
		flag=true;
		System.out.println("number is not prime= " + num);
	}
	
}
if(flag==false)
	System.out.println("num is prime");

}
}
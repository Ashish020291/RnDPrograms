package test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number;
Scanner in= new Scanner(System.in);
System.out.println("enter the number = ");
number=in.nextInt();

// 5=5*4*3*2*1
int value=1;
for(int i=5;i>0;i--)
{
	value=i*value;	
}
System.out.println("factorial  = " + value);

	}

}

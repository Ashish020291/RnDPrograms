package test;

import java.util.Scanner;

public class Revnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,rev=0;
Scanner sc= new Scanner(System.in);
System.out.println("enter any num = ");
num=sc.nextInt();
while(num!=0) 
{
	//951
	rev=rev*10;
	rev=rev+(num%10);
	num=num/10;
}
System.out.println("rev of a num = " + rev);
	}

}

package test;

import java.util.Scanner;

public class Linearserach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


int num, size,pos;

Scanner in= new Scanner(System.in);

System.out.println("Enter the size of array = " );
size=in.nextInt();
int array[]= new int[size];
//input
System.out.println("Enter the array elements = ");
for(int i=0;i<array.length;i++)
{
	array[i]=in.nextInt();
}

//output
System.out.println("array elements = ");
for(int i=0;i<array.length;i++)
{
	System.out.println(array[i]);
}
//search
System.out.println("Enter the elemnts need to search = ");
num=in.nextInt();
int count=0;

for(int i=0;i<array.length;i++)
{
	if (array[i]==num)
	{
		count++;
		
		System.out.println("emlement is at = " + (i+1));
	//continue;	
	}
	else if(array[i]!=num)
	{
		
		//System.out.println("your element is at = "+ i+1);
		continue;
	}
	
}
System.out.println("frequency = " + count);

/*
for(int a:array)
{
	count++;
	if (a==num)
	{
		System.out.println("your element is found = " + count);
	}
	
continue;
}
*/

	}
}

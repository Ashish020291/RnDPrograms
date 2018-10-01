package test;

import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in= new Scanner(System.in);
		System.out.println("enter the size");
		n=in.nextInt();
		int array[]= new int[n];

System.out.println("enter the array elements");
for(int i=0;i<array.length;i++)
{
	array[i]=in.nextInt();
}

int len=array.length;
int first=0;int last=len-1;
int midd= (first+last)/2;
System.out.println("enter number to be search");
int num=in.nextInt();

while(first<=last)
{
	if(array[midd]<num)
		first=midd+1;
	else if(array[midd]==num)
	{
		System.out.println("element is at = "+ (midd+1));
		break;
	}
	else
		last=midd-1;
	
	midd=(first+last)/2;
}
if(first>last)
{
	System.out.println("element not present");
}


	}

}

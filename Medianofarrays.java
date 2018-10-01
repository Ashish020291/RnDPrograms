package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Medianofarrays {
	public static void main(String args[])
	{
int array1[]= {1,2,3,4,5,6,4};
int array2[]= {1,2,3,4,5,6,4};
int[] median=new int[7];
for(int i=0;i<array1.length;i++)
{
median[i]= (array1[i] + array2[i])/2;	
}
for(int i:median)
{
	System.out.println(i);
}
System.out.println("remove duplicates = ");

HashSet<Integer> set=new HashSet<Integer>(); 
for(int i:array1)
{
	set.add(i);
}
Iterator<Integer> itr = set.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}

int array3[]= {9,8,7,1,4,5};
int small=0;
for(int i=0;i<6;i++)
{
	for(int j=1;j<6;j++)
	{
		if(array3[i]<array3[j])
		{
			small=array3[j];
		}
		
}
	System.out.println("smallest num" + small);

	int array4[]= {9,8,7,1,4,5};
	Arrays.sort(array4);
	for(int s: array4)
	{
	System.out.println(s);
	}

	int array7[]= {2,3,4,5,6,7,8,9,10};
	for(int m=0;m<10;m++ )
	{
		for(int h=2;h<10;h++)
		{
			if(array7[m]%h==0)
			{
				break;
			}
			else
				System.out.println("prime number" + array7[m]);
	}
	}
	
}
	}
}
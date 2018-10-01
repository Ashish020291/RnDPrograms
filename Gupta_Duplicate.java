package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Gupta_Duplicate {

	
	public static void main(String[] args) {
		// finding duplicating string and input into collection
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("ash");
		l1.add("ash");
		l1.add("ash");
		l1.add("yog");
		l1.add("par");
		l1.add("poo");
		l1.add(" ");
		
		int len=l1.size();
		
ArrayList<String> dup= new ArrayList<String>();
System.out.println("all array elements are =" + l1);
		
/**
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr1[i].equals(arr1[j]))
				{
					dup.add(arr1[j]);
	
				}
			}
		}
	for(String el:dup)
	{
		System.out.println(el);
	}
		**/
	System.out.println("*******************************************************************************************************************************");	
	
	HashSet<String> hs= new HashSet<String>();
		for(int i=0;i<len;i++)
		{
			hs.add(l1.get(i));
		}
		System.out.println("hash set" + hs);
		System.out.println("*******************************************************************************************************************************");	
		
		ArrayList<String> l2= new ArrayList<String>();
		l2.addAll(hs);
		
		System.out.println("unique elements in list are = " + l2);
		System.out.println("*****************************************************************************************************************************");
	
		for(int i=0;i<l2.size();i++)
		{
		l1.remove(l2.get(i));
		}
	System.out.println("duplicated elments = "+ l1);
	}

}

package test;

import java.io.IOException;

public class Runtimec {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Java Runtime exec() method
//Runtime.getRuntime().exec("notepad");

		//shut dwon sys
		 // Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0"); 
		
		// restart
		//Runtime.getRuntime().exec("shutdown -r -t 0");  
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		Runtime r= Runtime.getRuntime();
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		
		for(int i=0;i<1000000;i++)
		{
			new Runtimec();
		}
		
		  System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory()); 
		  System.gc();
			System.out.println(r.freeMemory());
	}

}

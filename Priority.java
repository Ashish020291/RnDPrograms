package test;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue <String> al= new PriorityQueue<String>();
al.add("we");
al.add("love");
al.add("study");
al.add("tonight");
System.out.println("head element " +al.element());
System.out.println("head element " +al.peek());
System.out.println("iterating elements");
Iterator itr= al.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}

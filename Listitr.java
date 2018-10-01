package test;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listitr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al= new ArrayList<String>();
al.add("a");
al.add("s");
al.add("h");
al.add("i");
al.add("s");
al.add("h");

ListIterator litr= al.listIterator();
while(litr.hasNext())
{
	System.out.println(litr.next());
}
while(litr.hasPrevious())
{
	System.out.println(litr.previous());
	
}

	}

}

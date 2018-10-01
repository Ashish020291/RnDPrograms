package test;

import java.util.ArrayList;

public class Arrlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al1= new ArrayList<String>();
al1.add("a");
al1.add("b");
al1.add("a");
al1.add("d");
al1.add("e");
al1.add("e");

ArrayList<String> al2=new ArrayList<String>();
al2.add("a");
al2.add("e");

// al1.removeAll(al2);  --> b/d
al1.retainAll(al2);

for(String a:al1)
System.out.println(a);
}
}
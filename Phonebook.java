package test;

import java.util.ArrayList;

public class Phonebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacts c1= new Contacts("ashish", "tanwar", "123");
		Contacts c2= new Contacts("parul", "tanwar", "098");
		Contacts c3= new Contacts("yogesh", "tanwar", "678");
		ArrayList<Contacts> al= new ArrayList<Contacts>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		System.out.println(al);
		
	}

}

class Contacts
{
	String fname;
	String lname;
	String ph;
	
	Contacts(String f,String l,String p)
	{
		fname=f;
		lname=l;
		ph=p;
	}
	
	public String  toString()
	{
		return fname + lname +ph;
	}
}
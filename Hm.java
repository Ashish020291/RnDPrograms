package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer, String> map= new HashMap<Integer,String>();
		map.put(1,"ashish");
		map.put(2,"shashi");
		/*Set<Map.Entry<Integer,String>> hm= map.entrySet();

		for(Entry<Integer, String> me:hm)
		{
			System.out.println(me.getValue());
			System.out.println(me.getKey());
		}
		*/
		for(Map.Entry m: map.entrySet())
		{
		System.out.println( m.getKey());
		}
		
	}

}          

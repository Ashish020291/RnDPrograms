package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// no sorting on hashmap : although values displayed as pet the keys
		HashMap< String, Integer>hm= new HashMap<String, Integer>();
		hm.put("yog" , 1);
		hm.put("ashish",5);
		hm.put("babli",7);
		
		for(Map.Entry<String,Integer> h:hm.entrySet())
		{
			System.out.println("hash map " + h.getKey()+ " " + h.getValue());
		}

		
		//hashset no sorting
		HashSet<String> hs= new HashSet<String>();
		hs.add("gap");
		hs.add("boy");
		hs.add("aapple");
		
		Iterator<String> i= hs.iterator();
		while(i.hasNext())
		{
			System.out.println("hashset " + i.next());
		}
		
		//linked hasset insertion order
		LinkedHashSet<String> lhs= new LinkedHashSet<String>();
		lhs.add("poo");
		lhs.add("ash");
		lhs.add("yog");
		Iterator<String> li= lhs.iterator();
		while(li.hasNext())
		{
			System.out.println("hashset " + li.next());
		}
		
		//linked hasset insertion order
				LinkedHashMap<String,Integer> lh1= new LinkedHashMap<String,Integer>();
				lh1.put("poo",1);
				lh1.put("ash",4);
				lh1.put("yog",2);
				for(Map.Entry<String, Integer>l2:lh1.entrySet() )
				{
					System.out.println("linkedhasmap " + l2.getKey() + " " + l2.getValue());
				}
				
				
				//hashset no sorting
				TreeSet<String> ts= new TreeSet<String>();
				ts.add("gap");
				ts.add("boy");
				ts.add("apple");
				
				Iterator<String> t1= ts.iterator();
				while(t1.hasNext())
				{
					System.out.println("hashset " + t1.next());
				}
				
				// no sorting on hashmap : although values displayed as pet the keys
				TreeMap< String, Integer>tm= new TreeMap<String, Integer>();
				tm.put("yog" , 10);
				tm.put("ashish",5);
				tm.put("babli",7);
				
				for(Map.Entry<String,Integer> h:tm.entrySet())
				{
					System.out.println("treemap " + h.getKey()+ " " + h.getValue());
				}

}
}
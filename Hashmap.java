package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
HashMap<String,Integer> hm= new HashMap<String,Integer>();
hm.put("a",new Integer(100));
hm.put("b",new Integer(200));
hm.put("c",new Integer(300));
hm.put("d",new Integer(400));

Set<Map.Entry<String,Integer>> s=hm.entrySet();
for(Map.Entry<String, Integer> me:s)
{
	System.out.println(me.getKey() + me.getValue());
}
	}

}

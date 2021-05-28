package CollectionPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HasMp {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("a", 100);
		hm.put("b", 200);
		hm.put("c", 300);
		hm.put("a", 400);
		
		System.out.println(hm.entrySet());
		System.out.println(hm.get("b"));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		//we don't have iterator method in map (hence it is converted to set by using keySet, entrySet or by below way)
		
		//First convert map into set
		Set s = hm.entrySet();
		
		//Iterating based on keys
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			int values = hm.get(key);
			System.out.println("Key is "+ key + " Values are "+ values);
		}
		
		//Iterating based on Entry
		Iterator<Entry<String,Integer>> it1 = hm.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String, Integer> a = it1.next();
			System.out.println(a);
			//Or syso("Key is " + a.getKey()+ "Value is" + a.getValue());
		}

	}

}

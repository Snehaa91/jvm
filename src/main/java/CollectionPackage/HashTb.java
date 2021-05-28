package CollectionPackage;

import java.util.Hashtable;

public class HashTb {

	public static void main(String[] args) {
		Hashtable<String,Integer> ht = new Hashtable<>();
		ht.put("Sneha", 200);
		ht.put("Kushwah", 300);
		//ht.put(null, 200);
		ht.put("Kushwaha", 400);
		System.out.println(ht);
		
		System.out.println(ht.get("Sneha"));
		System.out.println(ht.get("Kushwaha"));
		//System.out.println(ht.get(null));
	}

}

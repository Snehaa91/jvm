package CollectionPackage;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncArrList {

	public static void main(String[] args) {
	
		List<String> names = Collections.synchronizedList(new ArrayList<String>());
		names.add("Sneha");
		names.add("Kushwaha");
		names.add("Be Strong");
		
		//add, remove - we don't need explicitly synchronization 
		//but to traverse the value we need to synchronize it
		
		synchronized(names) {
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
      }
		CopyOnWriteArrayList<String> ca = new CopyOnWriteArrayList<String>();
		ca.add("Sneha");
		ca.add("Kushwaha");
		ca.add("You will get offer letter in 2 days");
		
		//we don't need to synchronization explicitly for add. remove or traverse
		
		Iterator<String> it1 = ca.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,2,3,4,5,6,2,7,9,4,0,4));
		HashSet<Integer> hp = new HashSet<Integer>(numbers);
		ArrayList<Integer> numberwithoutduplicates = new ArrayList<Integer>(hp);
		System.out.println(numberwithoutduplicates);
		
		
		
		
		
	}
}

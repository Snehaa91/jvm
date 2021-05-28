package CollectionPackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Integer> cc = new CopyOnWriteArrayList<Integer>(Arrays.asList(23,98,45,76));
		Iterator<Integer> it = cc.iterator();
		while(it.hasNext()) {
			int gems = it.next();
			System.out.println(gems);
			it.remove();
		}
		
	}

}

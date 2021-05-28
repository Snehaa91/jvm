package CollectionPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<Integer>(Arrays.asList(23,98,45,98,90));
		System.out.println(num);
		num.add(67);
		num.set(3, 100);
		System.out.println(num);
		
		Collections.sort(num);
		System.out.println(num);
		
		//Collections.sort(num, Collections.reverseOrder());
		//System.out.println(num);

		Collections.reverse(num);
		System.out.println(num);
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Hi");
		a1.add("Sneha");
		a1.add("How are");
		a1.add("You");
		
		StringBuilder sb = new StringBuilder();
		for(String s:a1) {
			sb.append(s);
			sb.append(",");
		}
		
		String str = sb.toString();
		System.out.println(str);
	}

}

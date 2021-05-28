package BasicPrograms.arrayListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class removeDuplicate {

	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<Integer>(Arrays.asList(23,23,67,43,90,54,56));
		Set<Integer> hm = new LinkedHashSet<Integer>(num);
		//List<Integer> newNum = new ArrayList<>(hm);
		//System.out.println("After Removing Duplicates from ArrayList"+ newNum);
		
		//Or
		num.clear();
		num.addAll(hm);
		System.out.println(num);
		
		
		}

}

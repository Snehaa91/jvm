package BasicPrograms.arrayListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(23,12,67,98,34,90));
		Collections.reverse(num);  //this way can only be done when you have set() method in that collection (value to be set at the given index)
		System.out.println(num);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(12,13,14,23,45,56,78));
		//PrintrevArrayList(numbers);
		System.out.println(numbers);
		System.out.println("After Reversing ");
		System.out.println(reverseArrList(numbers));
		//PrintrevArrayList(reverseArrList(numbers));
		
	}
	
	//Or
	public static ArrayList<Integer> reverseArrList(List<Integer> list){
		
		ArrayList<Integer> rev = new ArrayList<Integer>();   //passing arraylist in parameter
		for(int i = list.size()-1;i>=0;i--) { //iterating the parameter arraylist in reverse order and saving it in another arraylist
			rev.add(list.get(i));
		}
		return rev;
		}

}

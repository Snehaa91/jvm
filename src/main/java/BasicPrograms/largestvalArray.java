package BasicPrograms;

public class largestvalArray {

	public static void main(String[] args) {
		int[] a1 = {23, 24, 1, 9, 33, 98, 2, 4};
		int val = a1[0];
		for(int i = 0;i<a1.length;i++) {
			if(a1[i]>val) {
				val = a1[i];
			}
		}
		System.out.println(val);
	}

}

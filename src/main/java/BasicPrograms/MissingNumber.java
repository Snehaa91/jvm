package BasicPrograms;

public class MissingNumber {
	
	public void missingNum()
	{
		int[] arr = new int[] {1,2,3,4,6,7,8,9,10};
		//int[] arr1 = {1,2,3,4,6,7,8,9};
		
		int expected_elements = arr.length+1;
		int expected_sum = (expected_elements*(expected_elements+1))/2;
		
		System.out.println(expected_sum);
		
		int current_sum=0;
		for(int i =0;i<arr.length;i++) {
			current_sum=current_sum+arr[i];
		}
		
		System.out.println("Missing No: "+(expected_sum-current_sum));

	}
	
	
	public void xormethod() {
		int[] arr1 = {1,2,3,5,6,7,8,9,10};
	    int xor1 = arr1[0];
	    for(int i =1;i<arr1.length;i++) {
	    	xor1=xor1^arr1[i];
	    }
	    
	    int xor2=1;
	    for(int i=2;i<=(arr1.length+1);i++) {
	    	xor2=xor2^i;
	    }
	    System.out.println(xor1^xor2);
	
		
	}
	
	public static void main(String[] args) {
		MissingNumber obj = new MissingNumber();
	    obj.missingNum();
	    obj.xormethod();
	}
}
		

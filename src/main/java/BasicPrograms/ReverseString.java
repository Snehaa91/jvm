package BasicPrograms;

public class ReverseString {
	
	public void reverse1() {
		String name = "Sneha Kushwaha";
		int length = name.length();
		String rev = "";
		
		for(int i = length-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		obj.reverse1();

	}

}

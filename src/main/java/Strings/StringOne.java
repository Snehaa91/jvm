package Strings;

public class StringOne {
	
	public void run() {
		/*
		 * String s1 = "Sneha"; s1 = s1.concat("Sneha"); String s3 = new
		 * String("Sneha"); System.out.println(s1); System.out.println(s1==s3);
		 */
		/*
		 * String s3 = new String("Sneha"); System.out.println(s1==s2);
		 * System.out.println(s1.equals(s2)); System.out.println(s1.equals(s3));
		 * System.out.println(s1==s3);
		 */
		
		
		StringBuffer sb = new StringBuffer("SnehaSnehaSneha02");
		System.out.println(sb.capacity()); //16+5 = 21 //16+17
		System.out.println(sb.append("Kush"));
		System.out.println(sb.capacity());
		System.out.println(sb.append("snehasneha"));
		System.out.println(sb.capacity());
		
		StringBuffer sb1 = new StringBuffer("SnehaSnehaSneha02");
		System.out.println(sb1);
		System.out.println(sb.equals(sb1));
		System.out.println(sb1.toString());
		
		int i = 10;
		String sb2 = new String();
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		StringOne obj= new StringOne();
		obj.run();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * System.out.println(str1.length()); //provide int value String strd = new
		 * String("sneha");
		 * 
		 * String s = null;
		 * 
		 * System.out.println(s);
		 * 
		 * String str2= new String("Sneha   Kushwaha  ");
		 * 
		 * String str3= new String(""); System.out.println(str3.length()); //length is 0
		 * here
		 * 
		 * String str4= new String("                  ");
		 * 
		 * System.out.println(str4.isEmpty());
		 * 
		 * System.out.println(str1.compareTo(strd));
		 */
	}

}

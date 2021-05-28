package BasicPrograms;

public class primeNumbers {

	public static void main(String[] args) {
	 int i = 0;
	 int num = 0;
	 String primenumber = "";
	 
	 for(i=1;i<=100;i++) { //if 100 is not decided, use Scanner class and have the value in int n which can be written here instead 100
		 int counter = 0;
		 for(num=i;num>=1;num--) {
			 if(i%num==0) {
				 counter = counter+1;
			 }
		 }
		     if(counter==2) {
		    	 primenumber = primenumber+i+" ";
		     }
		  }
	   System.out.println("Primenumbers are " + primenumber);
	 }

	}



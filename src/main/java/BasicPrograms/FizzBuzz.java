package BasicPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzz {

	public static void main(String[] args) throws IOException {
		  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
          int n = Integer.parseInt(bufferedReader.readLine().trim());
          for(int i=0;i<=n;i++) {
          if(i%3==0 && i%5==0){
        	System.out.println("FizzBuzz");  
          }
          else if(i%3 == 0) {
          
        	  System.out.println("Fizz");
          }
          else if (i%5 == 0) {
        	  System.out.println("Buzz");
          }
          else {
        	  System.out.println(i);
          }
          
          bufferedReader.close();
	    }
	}
}



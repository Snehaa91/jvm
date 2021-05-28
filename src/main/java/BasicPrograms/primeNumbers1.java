package BasicPrograms;

import java.util.Scanner;

public class primeNumbers1 {

	public static void main(String[] args) {
		int i, j, flag = 0;
		Scanner sc = new Scanner(System.in);
		j = sc.nextInt();
		for(i=2;i<j;i++) {
			if(j%i==0) {
				flag = 0;
				break;
			}
			else {
				flag = 1;
			}
		}
		
		if(flag == 1) {
			System.out.println("It is a prime number");
		}
		else {
		System.out.println("Not a prime number");
}
	}
}

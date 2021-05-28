package BasicPrograms;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		/*
		 * int a = 0, b=1, c; System.out.print(a+" "+b+" ");
		 * 
		 * for(int i = 2;i<=10;i++) { c=a+b; System.out.print(c+ " "); a=b; b=c; }
		 */
		
		fibonacciSeries obj = new fibonacciSeries();
		obj.fib2(10);
	}
	
	public int fib2(int n) {
		int x=0, y=1, z=0, i=1;
		System.out.print(x+" "+y+" ");
		while(i<=n) {
			z=x+y;
			System.out.print(z+" ");
			x=y;
			y=z;
			i++;
		}
		return z;
		
	}

}

package JavaPractice.ThreadPackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InterruptThread extends Thread{
	
	public void run() {
		//Check interrupted() & isInterrupted() method also here
		
		//1. it internally change the status from true to false hence execution is completed (A & B) will help you.
		//System.out.println("A -" + Thread.interrupted());
		
		//2. it will not change the status and move into catch block after checking if it is interrupted or not
		System.out.println(Thread.currentThread().isInterrupted());
		
			try {
				for(int i = 1; i<=5;i++) {
				System.out.println(Thread.currentThread().getName() + "  " + i);
				Thread.sleep(1000); 
				//Only if sleep() or wait() is written, thread will be interrupted and move to catch block otherwise normal execution.
				//System.out.println("B -" + Thread.interrupted());
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	
	public static void main(String[] args) {
		
		InterruptThread obj = new InterruptThread();
		obj.start();
		obj.interrupt();
		
		
	}

}

//Concept for Thread Pool - check javatpoint 
class ABC {
	public void run2(){
		ExecutorService exe = Executors.newFixedThreadPool(5);
		Runnable it = new InterruptThread(); 
	    exe.execute(it);
	}
}

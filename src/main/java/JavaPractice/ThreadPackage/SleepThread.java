package JavaPractice.ThreadPackage;

public class SleepThread extends Thread {
	
	public void run() {
		for(int i =1;i<=5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i + Thread.currentThread().getName());
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		SleepThread obj = new SleepThread();
		//obj.start(); //Thread is created
		obj.run(); //Thread is not created only method is called here
		
		SleepThread obj2 = new SleepThread();
		//obj2.start();
		obj2.run(); //Here it will not run parallely
		
		/*
		 * for(int i = 1; i<=5; i++) {
		 * 
		 * try { Thread.sleep(1000); System.out.println(i); } catch(Exception e) {
		 * System.out.println(e); }
		 * 
		 * }
		 */ // This example is without extending to Thread class
		
		
		
	}
	}


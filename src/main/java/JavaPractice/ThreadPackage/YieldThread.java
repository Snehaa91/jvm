package JavaPractice.ThreadPackage;

public class YieldThread extends Thread{

	//Every time output would be different because it depends on Thread Scheduler
	//If in any thread -> yield() method is used...the rest thread would run as per their priorities (if high then it wont stop)
	//If in any thread -> yield() method is used and Thread Scheduler accept it then that output will come in last after other threads output
	public void run() {
		for(int i = 1; i<=5;i++) {
		System.out.println(Thread.currentThread().getName() + "-" + i);
	}
	}
	public static void main(String[] args) {
		YieldThread obj = new YieldThread();
		obj.start();
		Thread.yield();
		
		for(int i = 1; i<=5;i++) {
			System.out.println(Thread.currentThread().getName() + "-" + i);
		}
		

	}

}
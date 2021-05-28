package JavaPractice.ThreadPackage;

public class DaemonThread1 extends Thread{
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Its a daemon run thread");
		}
		
		System.out.println("Its a normal thread");
	}

	public static void main(String[] args) {
		DaemonThread1 obj1 = new DaemonThread1();
		DaemonThread1 obj2 = new DaemonThread1();	
		DaemonThread1 obj3 = new DaemonThread1();
		
		obj1.setDaemon(true);
		obj1.start();                 //To invoke start() method, class should extend Thread class
		System.out.println("*********************");
		
		obj2.setDaemon(true);
		obj2.start();
		
		System.out.println("*********************");
		obj3.start();

	}

}

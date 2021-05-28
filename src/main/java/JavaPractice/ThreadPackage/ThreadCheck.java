package JavaPractice.ThreadPackage;

public class ThreadCheck extends Thread {
	
	//extends the Thread class
	//Override run() method
	//Create object of ThreadCheck class
	//Invoke the thread using start() method -> run() method will be invoked by start() method
	
	public void run() {
		System.out.println("Tasks for thread1");
	}

	public static void main(String[] args) {
		ThreadCheck obj = new ThreadCheck();
		obj.start();
		//Thread can be only invoked once
	}
}

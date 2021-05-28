package JavaPractice.ThreadPackage;

public class DaemonThread extends Thread{
	
	public void run() {
		System.out.println("Run thread");
		//Thread.currentThread().setDaemon(true); This will also throw exception but with the new new thread name - DaemonThread
	
		}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		DaemonThread obj = new DaemonThread();
		//Thread.currentThread().setDaemon(true); //if you write here -> it will not execute run() method task & give exception
		obj.setName("DaemonThread");
		obj.setDaemon(true);
		obj.start();
		 //if you write here, it will execute run() method but still give exception - IllelgalThreadStateException
		//Here after changing the name of the main method thread to "Daemon Thread" -> it is still considered as Main method thread 
		//And for main method, we can not create Daemon thread i.e. setDaemon() method will give exception.
		//We need to set the thread to daemon for the Class's Object (obj)
		
		
	}
	

}

package JavaPractice.ThreadPackage;

public class JoinThread extends Thread{
	
	static Thread mainThread;
	
	public void run() {
		//If we want to execute main method task first then call join() using main methods reference.
		//Here it is mainThread
		for(int i = 1; i<=5;i++) {
			try {
				mainThread.join();
				System.out.println(Thread.currentThread().getName()+ "-" + i);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main (String [] args) throws InterruptedException {
		
		mainThread = Thread.currentThread();
		
		JoinThread t = new JoinThread();
		t.start();
		//t.join();  //If we are writing this method here, it will take the reference t for JoinThread class & its object & 
		           //will execute first before executing main method tasks
		
		for(int i = 1; i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+ "-" + i);
		}
	}

}

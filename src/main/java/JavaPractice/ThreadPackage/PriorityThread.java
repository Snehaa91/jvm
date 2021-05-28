package JavaPractice.ThreadPackage;

public class PriorityThread extends Thread{
	
	public void run() {
		
		System.out.println("Child Priority: " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		
		System.out.println("Parent Priority " + Thread.currentThread().getPriority());
		PriorityThread obj  = new PriorityThread();
		obj.start();
		obj.setPriority(MAX_PRIORITY);
	}

}

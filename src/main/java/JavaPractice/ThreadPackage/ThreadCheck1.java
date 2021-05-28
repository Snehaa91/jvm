package JavaPractice.ThreadPackage;

public class ThreadCheck1 implements Runnable{
	
	    //implements the Runnable class
		//Override run() method
		//Create object of ThreadCheck1 class
        //Need to create Thread class object too as start() method is not present in ThreadCheck1 class which implements Runnable 
	      // interface which has only one method run();
	    //And pass ThreadCheck1 object to Thread class constructor
	    //Now call start() method to invoke run() method - or override it 
        //Hence created Thread.

	@Override
	public void run() {
		System.out.println("Thread task is present");
	}
	
	public static void main(String[] args) {
		ThreadCheck1 obj1 = new ThreadCheck1();
		Thread th = new Thread(obj1);
		th.start();
		
	}

}

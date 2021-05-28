package JavaPractice.Synchronization;

class TotalEarnings extends Thread{
	
	int total = 0;
	public void run() {
		
		synchronized(this) {
		for(int i = 1;i<=10;i++) {
			total = total+100;
		}
		 this.notify();
		}
	}
	
}

public class InterThread {

	public static void main(String[] args) throws InterruptedException {
		
		TotalEarnings obj = new TotalEarnings();
		obj.start();
		//System.out.println("Total Earning "+ obj.total); //there are 2 threads - main & thread 0
		                                                   //If below block is absent, it will give output as 0 which is due to 1st execution 
		                                                   //of main thread. 
		
		synchronized(obj) {
			obj.wait();
			System.out.println("Total Earning "+ obj.total);
		}

	}

}

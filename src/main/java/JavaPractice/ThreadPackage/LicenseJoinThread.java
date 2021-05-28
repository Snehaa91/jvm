package JavaPractice.ThreadPackage;

class Medical extends Thread{
	
	
	public void run() {
		try {
			System.out.println("Medical task started");
			Thread.sleep(2000);
			System.out.println("Medical completed");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

class TestDrive extends Thread{
	public void run() {
		try {
			System.out.println("TestDrive task started");
			Thread.sleep(2000);
			System.out.println("TestDrive completed");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

class OfficerSign extends Thread{
	public void run() {
		try {
			System.out.println("OfficerSign task started");
			Thread.sleep(2000);
			System.out.println("OfficerSign completed");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

public class LicenseJoinThread {
	
	public static void main(String [] args) throws InterruptedException {
		
	//Thread threadM = Thread.currentThread(); // try this later
		
	Medical t1 = new Medical();
	t1.start();
	t1.join();
	
	TestDrive t2 = new TestDrive();
	t2.start();
	t2.join();
	
	OfficerSign t3 = new OfficerSign();
	t3.start();
	

}
}
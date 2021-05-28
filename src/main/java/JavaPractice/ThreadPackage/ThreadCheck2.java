package JavaPractice.ThreadPackage;

public class ThreadCheck2 extends Thread{
	
	public void run()
	{
		System.out.println("Run Thread");
	}
	public static void main(String[] args) {
		
		//System.out.println(Thread.currentThread()); //This will give you the main thread reference even if the class not extending Thread
        System.out.println(Thread.currentThread().getName());  //Thread name is "main"
        
        ThreadCheck2 obj3 = new ThreadCheck2();
        obj3.start();
        Thread.currentThread().setName("NewThread"); 
        
        System.out.println(Thread.currentThread().getName()); 
                
	}

}

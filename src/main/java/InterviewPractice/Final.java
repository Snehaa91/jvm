package InterviewPractice;

public abstract class Final {
	
	Final(){
		System.out.println("COnstructor");
	}
	
	public static void sleep() {
		System.out.println("Static method");
	}
	
	public final void eat() {
		System.out.println("Final method");
	}
	 
	 public abstract void run();

}

class subclass {
	public void run() {
		System.out.println("Sub class method");
	}
	
	public static void eat() {
		
	}
	
	
}

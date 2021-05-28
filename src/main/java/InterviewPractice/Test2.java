package InterviewPractice;

public abstract class Test2 {
	public void run() {
		System.out.println("parentr static method");
	}

}

class Test3 extends Test2{
	public void run() {
		System.out.println("Child static method");
	}
	
}

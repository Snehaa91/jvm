package InterviewPractice;

public class Test5 {
	//int balance;
	
	public static int balance;
	Test5(int balance){
		System.out.println("Parent balance" + balance);
	}
	
class childTest5 extends Test5{
	
	
	public childTest5() {
		super(balance);
		System.out.println("Withoutparameter cchild constructor");
	}
	
	childTest5(int balance){
		super(balance);
		System.out.println("Child balance" + balance);
		
	}

}
}
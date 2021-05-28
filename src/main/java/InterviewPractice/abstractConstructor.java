package InterviewPractice;

public abstract class abstractConstructor {

	abstractConstructor(String msg){
		System.out.println(msg);
	}
	
	public final static void main(String[] args) {
		childAAA obj = new childAAA("ChildObject");
	}
}

class childAAA extends abstractConstructor{
	
	childAAA(String msg){
	 super(msg);
	 System.out.println(msg);
	}
	
	
}

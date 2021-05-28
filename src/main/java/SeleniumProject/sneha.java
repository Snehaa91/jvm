package SeleniumProject;

public  class sneha {
	
	  public String run() {
		System.out.println("Happy Tuesday");
		return null;
	}
	 
	 public  void sleep1() {
		 
	 }	
}

class Child extends sneha{

	public  String run() {
		
	System.out.println("Happy Monday");
	return null;
	}

	
	public void sleep() {
		System.out.println("Child-sleep");
		
	}
	
}

//public - more accessible (child me rehna chahiye)
//protected - through out the same pack + sub classes in the other package too
//default - only in same package
//private - only in same class
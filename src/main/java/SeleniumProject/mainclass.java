package SeleniumProject;

public class mainclass {
	
	public static void main(String[] args) {
		/*
		 * //sneha s = new sneha();
		 *  Child c = new Child(); 
		 *  sneha sd = new Child(); Child
		 * Child cd = new sneha();
		 */
		
		Child cd = new Child();
		cd.sleep();
		cd.run();
		
		sneha sd = new Child();
		sd.sleep1();
		sd.run();
		
		Child cdf = (Child)new sneha();
		cdf.run();
		
		
		
	}

}

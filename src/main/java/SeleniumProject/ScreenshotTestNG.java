package SeleniumProject;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListernerClass.class)

public class ScreenshotTestNG extends BaseClass{
	
//reals testcases are inside this class
	
	  @BeforeMethod 
	  public void setup() { 
		  launchbrowser(); 
		  }
	 
	  @AfterMethod 
	  public void quit() { 
		  driver.quit(); 
	  }
	 
	@Test
	public void Testing1() {
		Assert.assertEquals(false, true); 
	}
	

    @Test
	public void Testing2() {
		Assert.assertEquals(false, true); 	 
	}
    
    @Test
   	public void Testing3() {
   		Assert.assertEquals(false, true); 
   	}
	
	
	
	
}

package SeleniumProject;

import java.io.IOException;

import org.testng.annotations.Test;

public class MainMethod {

	@Test
	public void run() {
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		
		ScreenshotCheck obj = new ScreenshotCheck();
		obj.LaunchBrowser();
		obj.loginPage();
		
		

	}

}

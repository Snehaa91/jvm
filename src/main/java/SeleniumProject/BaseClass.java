package SeleniumProject;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	//We can write launching browser
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SN262736\\eclipse-workspace\\jvm\\src\\main\\java\\Utilities\\Broswers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	}
	
	//Generic TakeScreenshot method 
	
	public static void screenshotmethod(String testcaseName) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("C:\\Users\\SN262736\\eclipse-workspace\\jvm\\Screenshots\\"+testcaseName+"_"+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//If you dont write timestamp then it will overwrite the same file again n again
		
}

	public static String timestamp() {
		String sr = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		return sr;
				
	}
}

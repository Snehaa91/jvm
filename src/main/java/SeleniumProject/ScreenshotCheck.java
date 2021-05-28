package SeleniumProject;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCheck {
	
	static WebDriver driver;
	
	public static void takescreenshot(String filename) throws IOException {
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File fs = scrShot.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(fs, new File("path where you want to take the screenshot/"+filename+.jpg"));
	}
	
	public void LaunchBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SN262736\\eclipse-workspace\\jvm\\src\\main\\java\\Utilities\\Broswers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
	    takescreenshot("LaunchBrowser");
	    
	   
	}
	
	public void loginPage() {
		 
				 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		         driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		         driver.findElement(By.cssSelector("input[type='submit']")).click();
		 
		 }
	
	public static void screenshotwebelement(WebElement element) throws IOException {
		File fs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //take screenshot for full page
		
		BufferedImage fullscreen = ImageIO.read(fs); //read the screenshot image
		int width = element.getSize().getWidth(); //get the width of the element
		int height = element.getSize().getHeight();  //get the height of the element
		
		Point location = element.getLocation(); //get the x & y coordinates of the webelement
		
		//now get the screenshot of webelement using height, width & coordinates
		BufferedImage logoimage = fullscreen.getSubimage(location.getX(), location.getY(), width, height);
		ImageIO.write(logoimage, "png", fs);
		
		//Now save the captured screenshot
		Random rm = new Random();
		//FileUtils.copyFiles(fs,new File("./screenshot..../"+rm.nextInt()+".png"));
	}
	
	public void screenshot1(WebDriver driver) {
		File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destinationfile = new File("path"+ timestamp()+".jpeg");
		
	}
	
	public static String timestamp() {
		
		String time= new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		return time;
		
	}
		
	
	}


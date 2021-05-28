package SeleniumProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTableCheck {

	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\SN262736\\eclipse-workspace\\jvm\\src\\main\\java\\Utilities\\Broswers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		
		//Calling a single text from the webtable
		WebElement FirstRowContent = driver.findElement(By.xpath("//*[contains(@className, 'tsc_table_s13')]"));
		System.out.println(FirstRowContent.getText());
		
		driver.getWindowHandle(); //String
		driver.getWindowHandles(); //Set of Strings
		driver.switchTo().defaultContent();
		
		Map m1 = new HashMap();
		Set s1 = m1.entrySet();
		Iterator<Map.Entry<String, String>> it = s1.iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> entry =  (Map.Entry<String,String>) it.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
			WebDriver driver1 = new InternetExplorerDriver();
			DesiredCapabilities cp = new DesiredCapabilities();
			cp.acceptInsecureCerts();
			cp.setAcceptInsecureCerts(true);
			//
*/			/*
			DesiredCapabilities cp1 = DesiredCapabilities.internetExplorer();
			driver.navigate().to("");
			Actions ac = new Actions(driver);
			
			Select s = new Select(driver.findElement(By.xpath("")));*/
			
			ArrayList<String> names = new ArrayList<String>(Arrays.asList("Sneha", "Kushwaha", "is","good"));
			Object abc[] = names.toArray();
			System.out.println(Arrays.toString(abc));
			for(Object o :abc) {
				System.out.println((String)o);
			}
			
		}
	}



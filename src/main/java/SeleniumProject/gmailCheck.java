package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailCheck {
	
	WebDriver driver;
	
	public void logincredentials() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SN262736\\eclipse-workspace\\jvm\\src\\main\\java\\Utilities\\Broswers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&continue=https%3A%2F%2Fmail.google.com%2Fmail&service=mail&ec=GAlAFw&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("snehaa91@gmail.com");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("chinnurohit");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
			
	}

	public static void main(String[] args) {
		
		gmailCheck obj = new gmailCheck();
		obj.logincredentials();
	}

}

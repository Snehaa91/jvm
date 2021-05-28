package InterviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import freemarker.template.Configuration;

public class WaitCheck {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		System.out.println("main method");
		}
	
	public void movetoelement(By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public void javascriptmethod(By locator){
		
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	WebElement element = driver.findElement(locator);
	
	//to move to element using scrollIntoView 
	jse.executeScript("arguments[0].scrollIntoVeiw(true);", element);
	
	//to scroll up
	jse.executeScript("window.scrollBy(0,250);", "");
	
	//to scroll Down
	jse.executeScript("window.scrollBy(0. -250);", "");
	
	//click using javascriptexecutor
	jse.executeScript("arguments[0].click();", element);
	
	}
	
	
}



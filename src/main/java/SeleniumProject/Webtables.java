package SeleniumProject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class Webtables {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SN262736\\eclipse-workspace\\jvm\\src\\main\\java\\Utilities\\Broswers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		//find out the total count of rows
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div/div[1]/table/tbody/tr"));
		int rowcounts = rows.size();
		System.out.println(rowcounts);
		
		//Find all the elements in the first coulmns
		String firstxpath = "//*[@id=\"post-body-5867683659713562481\"]/div/div[1]/table/tbody/tr[";
		String lastxpath = "]/th";
		for(int i=1;i<=rowcounts;i++) {
			String actualxpath = firstxpath+i+lastxpath;
			WebElement rowvalue = driver.findElement(By.xpath(actualxpath));
			System.out.println(rowvalue.getText());
			
		}
		
		System.out.println("********************************************");
		
		//Find all the elements of the first row
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div/div[1]/table/tbody/tr[1]/td"));
		int colcount = columns.size();
		String firstcol = "//*[@id=\"post-body-5867683659713562481\"]/div/div[1]/table/tbody/tr[1]/td[";
		String lastcol = "]";
		for(int i = 1;i<=colcount;i++) {
			String actualcol = firstcol+i+lastcol;
			WebElement allcolumns = driver.findElement(By.xpath(actualcol));
			System.out.println(allcolumns.getText());
		}
		
		System.out.println("****************************");
		
		driver.findElement(By.xpath(""));
		Runtime.getRuntime().exec("");
		
		System.out.println("****************************");
		
		ProfilesIni obj = new ProfilesIni();
		FirefoxProfile ffprf = obj.getProfile("MyProfile");
		
		
		FirefoxOptions opt = new FirefoxOptions();
		opt.setProfile(ffprf);
		WebDriver driver2 = new FirefoxDriver(opt);
		

		System.out.println("****************************");
		
		driver.navigate().to("javascript:document.getElememntById('overridelink').click()"); //to handle SSL certificate in IE
		
		
		
	}
	

}

package SeleniumProject;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class customDownload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SN262736\\eclipse-workspace\\jvm\\src\\main\\java\\Utilities\\Broswers\\chromedriver.exe");
		
		Map<String, Object> prefs = new HashMap<String, Object>(); //Setting new download directory path
		//prefs.put("profile.default_content_settings.popups", 0); // written only if after clicking on download button there should not be any popups
		prefs.put("download.default_directory", System.getProperty("user.dir") + File.separator + "ExternalDownloads");
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.learningcontainer.com/sample-text-file/");
		driver.findElement(By.linkText("Download")).click();
	}

}
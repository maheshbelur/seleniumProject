package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/rashmimahesh/Documents/Seleniumfiles/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title"+ title);
		
	}
	
}

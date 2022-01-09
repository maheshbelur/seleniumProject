package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/rashmimahesh/Documents/Seleniumfiles/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.caesars.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title"+ title);
		
		WebElement bookAroom = driver.findElement(By.xpath("//a[contains(@title,'Book A Room')]"));
		bookAroom.click();
		
		String text = driver.findElement(By.xpath("//*[contains(text(),'Best Rate Guarantee')]")).getText();
		System.out.println("test="+text);
		
		//driver.findElement(By.id("dropdown_2__popout")).click();
		//Select select = new Select(driver.findElement(By.id("dropdown_2__popout")));
		//select.selectByVisibleText("Flamingo Las Vegas");
		
		
		
		
		
	}
	
}

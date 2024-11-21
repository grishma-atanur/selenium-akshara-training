package day23;
//interview Question-write the script to check if page is loaded or not in 3secs
//driver.get()-enters url and waits untill page is loaded
//driver.manage().timeouts().getPageLoadTimeout()-used by driver.get(), navigate.back,forward,refresh,
//navigate.to()
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
//Solution for NSEE:Solution 6 : PageLoadTimeout
public class Demo7 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Duration defaultPageLoadTimeOut = driver.manage().timeouts().getPageLoadTimeout();//this gets default maximum
		//time to wait
		System.out.println(defaultPageLoadTimeOut);
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));//here we can custimise the time
		Duration modifiedPageLoadTimeOut = driver.manage().timeouts().getPageLoadTimeout();
		System.out.println(modifiedPageLoadTimeOut);
		
		//enter the url in address bar & wait till the page is loaded
		try 
		{
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			System.out.println("Page is loaded within 3s");
		}
		catch (Exception e) 
		{
			System.out.println("Page is NOT loaded within 3s");
		}
		driver.quit();
	}

}

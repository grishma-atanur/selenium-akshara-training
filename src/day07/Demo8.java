package day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {
//pseudo code
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver= new ChromeDriver();
		//enter the url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter valid user name
		driver.findElement(By.cssSelector("#input-username")).sendKeys("Admin");
		//enter valid password
		driver.findElement(By.cssSelector("#input-password")).sendKeys("admin123");
		//click on go button
		driver.findElement(By.cssSelector("button[name='login-button']")).click();
		Thread.sleep(2000);
		//verify that home page is displayed
		String expectedURL="https://pos.aksharatraining.in/pos/public/home";
		System.out.println("Expected URL:"+expectedURL);
		
		String actualURL=driver.getCurrentUrl();
		System.out.println("Actual URL:"+actualURL);
		
		if(expectedURL.equalsIgnoreCase(actualURL))
		{
			System.out.println("PASS: Home Page is Displayed");
		}
		else
		{
			System.out.println("FAIL: Home Page is NOT Displayed");
		}
		
		if(actualURL.contains("home"))
		{
			System.out.println("PASS: Home Page is Displayed-contains home");
		}
		else
		{
			System.out.println("FAIL: Home Page is NOT Displayed-does not contains home");
		}
		//close the browser
		
		driver.quit();
	}

}

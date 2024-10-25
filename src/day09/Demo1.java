package day09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
//login to pos application-xpath
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver= new ChromeDriver();
		//enter the url.
		driver.get("https://pos.aksharatraining.in/pos/public/#");
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter valid user name
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("admin");
		//enter valid password
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("pointofsale");
		//click on go button
		driver.findElement(By.xpath("//button[@ type='submit']")).click();
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

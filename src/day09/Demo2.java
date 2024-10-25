package day09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
//pseudo code
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver= new ChromeDriver();
		//enter the url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(1000);		//enter valid user name
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		//enter valid password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		//click on go button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		//verify that home page is displayed
		String expectedURL="dashboard";
		System.out.println("Expected URL:"+expectedURL);
		
		String actualURL=driver.getCurrentUrl();
		System.out.println("Actual URL:"+actualURL);
		
		
		if(actualURL.contains("dashboard"))
		{
			System.out.println("PASS: Home Page is Displayed-contains dashboard");
		}
		else
		{
			System.out.println("FAIL: Home Page is NOT Displayed-does not contains dashboard");
		}
		//close the browser
		
		driver.quit();
	}

}

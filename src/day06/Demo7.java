package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 
{
	public static void goBack(WebDriver driver)
	{
		try 
		{
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Selenium/HTML%20files/Sample3.html");
		Thread.sleep(1000);
		
		driver.findElement(By.tagName("a")).click();
		goBack(driver);
		
		driver.findElement(By.id("a1")).click();
		goBack(driver);
		
		driver.findElement(By.name("n1")).click();
		goBack(driver);
		
		driver.findElement(By.className("c1")).click();
		goBack(driver);
		
		driver.quit();
	}

}

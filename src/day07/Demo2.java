package day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
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
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Selenium/HTML%20files/Sample3.html");
		driver.findElement(By.linkText("Google")).click();
		goBack(driver);
		driver.findElement(By.partialLinkText("Go")).click();
		goBack(driver);
		driver.findElement(By.partialLinkText("oo")).click();
		goBack(driver);
		driver.findElement(By.partialLinkText("Google")).click();
		goBack(driver);
		driver.findElement(By.partialLinkText("Ge")).click();
	}

}

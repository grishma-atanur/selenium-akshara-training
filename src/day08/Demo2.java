package day08;

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
		driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Selenium/HTML%20files/Sample4.html");
		//#match:3
		driver.findElement(By.xpath("./html/body/a")).click();//fb
		goBack(driver);
		//#match:3
		driver.findElement(By.xpath("/html/body/a")).click();//fb
		goBack(driver);
		//#match:1 
		driver.findElement(By.xpath("/html[1]/body[1]/a[1]")).click();//fb
		goBack(driver);
		//#match:1 
		driver.findElement(By.xpath("/html/body/a[1]")).click();//fb
		goBack(driver);
		//#match:1 
		driver.findElement(By.xpath("/html/body/a[2]")).click();//gmail
		goBack(driver);
		//#match:1 
		driver.findElement(By.xpath("/html/body/a[3]")).click();//google
		goBack(driver);
		try 
		{
		driver.findElement(By.xpath("/html/body/a[4]")).click();//NSEE
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		goBack(driver);
		driver.quit();
	}

}

package day18;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//get title of all the windows
public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Selenium/HTML%20files/Sample11.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("A5")).click();
		Thread.sleep(1000);
		Set<String> allWindows = driver.getWindowHandles();
		for(String wh:allWindows)
		{
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
			driver.close();
			Thread.sleep(1000);
		}
		
		
	}

}

package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Selenium/HTML%20files/Sample9.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("A");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("A");
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}

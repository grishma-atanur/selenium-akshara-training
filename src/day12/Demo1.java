package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Selenium/HTML%20files/Sample8.html");
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.id("A1"));
		element.clear();
		Thread.sleep(1000);
		element.sendKeys("Akshara");
		Thread.sleep(1000);
		driver.quit();
		
	}

}

package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Selenium/HTML%20files/Sample11.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("A5")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}

package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 {
//write a script to verify that submit button is present below ok button
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Selenium/HTML%20files/Sample8.html");
		int y_OK=driver.findElement(By.id("A7")).getLocation().getY();
		int y_Submit=driver.findElement(By.id("A8")).getLocation().getY();
		if(y_OK<y_Submit)
		{
			System.out.println("PASS:submit button is present below ok button");
		}
		else
		{
			System.out.println("FAIL:submit button is NOT present below ok button");
		}
		
		driver.quit();
		
	}

}

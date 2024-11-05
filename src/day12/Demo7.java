package day12;
//entering input into element which is disabled-we get ElementNotInteractableException
//so used try catch
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Selenium/HTML%20files/Sample8.html");
		
		driver.findElement(By.id("A1")).sendKeys(".");
		try 
		{
			driver.findElement(By.id("A4")).sendKeys(".");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		driver.quit();
	}

}

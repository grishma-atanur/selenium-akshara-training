package day12;
//UnsupportedOperationException-coz we used submit() method on
//normal button(in which type value is not submit)
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Selenium/HTML%20files/Sample8.html");
		Thread.sleep(1000);
		driver.findElement(By.id("A7")).submit();
		System.out.println("Clicked on OK Button");
		Thread.sleep(1000);
		driver.quit();
		
		
		
	}

}

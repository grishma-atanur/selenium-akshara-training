package day08;
//find Element by using text attribute
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
//use attribute in xpath
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
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/a[text()='Google']")).click();
		goBack(driver);
		driver.findElement(By.xpath("//a[text()='Google']")).click();
		goBack(driver);
		driver.quit();
	}

}

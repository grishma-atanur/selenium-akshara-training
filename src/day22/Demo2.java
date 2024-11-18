package day22;
//Instead of Thread.sleep() its better to use implicitlyWaitTimeout(Duration.ofSeconds())
//PT-is polling timeout
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		Duration defaultTime = driver.manage().timeouts().getImplicitWaitTimeout();//gets defualt timeout of Implicitwait
		System.out.println(defaultTime);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//specify the timeout for each findElement/findElements
		//(up to 10seconds until Element is found
		
		Duration modifiedTime = driver.manage().timeouts().getImplicitWaitTimeout();//Get Defualt time of Implicittime after waittime
		System.out.println(modifiedTime);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.cssSelector("li.oxd-userdropdown")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		
		driver.quit();
	}

}

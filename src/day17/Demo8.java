package day17;
//Check whether downloaded pdf is present in downloads folder
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Selenium/HTML%20files/Sample10.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("A3")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("PageLink_9")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("DirectLink_13")).click();
		Thread.sleep(4000);
		driver.quit();
	}

}

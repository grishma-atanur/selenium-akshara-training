package day24;
//StaleElement Exception-refresh page after finding element and before sending keys
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		//driver.navigate().refresh();
		WebElement userName=driver.findElement(By.id("input-username"));
		driver.navigate().refresh();//refresh after finding element and before sending keys
		userName.sendKeys("admin");
		//driver.navigate().refresh();
	}
}

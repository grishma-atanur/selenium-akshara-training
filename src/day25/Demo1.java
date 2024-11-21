package day25;
//StaleElement Exception-refresh page after finding element and before sending keys
//address of the element(username) is changed after refreshing the page-so we get staleElementReferenceException
//this means reference of the element is stale(old or expired)
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

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
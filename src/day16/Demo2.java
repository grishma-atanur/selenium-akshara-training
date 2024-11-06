package day16;
//Drag and Drop with delay
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement block3 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		
		Actions actions=new Actions(driver);
		actions.clickAndHold(block1).moveToElement(block3).pause(Duration.ofSeconds(3)).release().perform();
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}

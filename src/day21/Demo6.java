package day21;
//getAllSelectedOptions()
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo6 {
//print only selected options 
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Selenium/HTML%20files/Sample15.html");
		 driver.manage().window().maximize();
		
		 WebElement listBox = driver.findElement(By.id("A1"));
		 Select select=new Select(listBox);
		
		 List<WebElement> allOptions = select.getAllSelectedOptions();
		 for(WebElement option:allOptions)
		 {
			 System.out.println(option.getText());
		 }
		 
		 
		 Thread.sleep(1000);
		 driver.quit();
	}

}

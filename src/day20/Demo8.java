package day20;
//getOptions() method similar to findElements-get all the options from 
//list box
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo8 {

	public static void main(String[] args) throws Exception {
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Selenium/HTML%20files/Sample13.html");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 WebElement listBox = driver.findElement(By.id("A1"));
		 Select select=new Select(listBox);
		 
		List<WebElement> allOptions = select.getOptions();
		int count= allOptions.size();
		System.out.println(count);
		
		for(WebElement option:allOptions)
		{
			System.out.println(option.getText());
		}
		
		 
		 Thread.sleep(1000);
		 driver.quit();
		 

	}

}

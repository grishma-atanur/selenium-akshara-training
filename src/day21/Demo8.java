package day21;
//since we cannot sort webelements(coz webElements dont implement comparable and comparator interface),
//we need to take text of each option and then sort
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo8 {
//	print content of list box in sorted order
	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Selenium/HTML%20files/Sample15.html");
		 driver.manage().window().maximize();
		
		 WebElement listBox = driver.findElement(By.id("A1"));
		 Select select=new Select(listBox);
		 List<WebElement> allOptions = select.getOptions();
		 List<String> allText =new ArrayList<String>();
		 
		 for(WebElement option:allOptions)
		 {
			 String text=option.getText();
			 allText.add(text);
		 }
		 
		 System.out.println(allText);
		 
		 Collections.sort(allText);
		 
		 System.out.println(allText);
		 driver.quit();
	}

}

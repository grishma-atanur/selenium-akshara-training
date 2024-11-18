package day21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo9 {
//Print all the options along with thier occurence-using Map
//for better understanding refer mapping programs in java class
	public static void main(String[] args) {

		 
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Selenium/HTML%20files/Sample16.html");
		 driver.manage().window().maximize();
		
		 WebElement listBox = driver.findElement(By.id("A1"));
		 Select select=new Select(listBox);
		 List<WebElement> allOptions = select.getOptions();

		 
		 LinkedHashMap<String, Integer> map=new LinkedHashMap<String, Integer>();
			
			for(WebElement option:allOptions)
			{
				String key=option.getText();
				
				if(map.containsKey(key))
				{
					Integer v = map.get(key);
					v++;
					map.put(key, v);
				}
				else
				{
					map.put(key,1);
				}
				
			}
			
			System.out.println(map);
			
			//Assignment-print only duplication option-already done in java class
			//Assignment-print only unique option-already done in java class
			
		 driver.quit();
	}

}

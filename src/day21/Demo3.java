package day21;
//there is no selectAll() method in selenium so we need to take the
//count of listbox first then use for loop to 
//get all the options in listbox
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {
//write a script to select all the options in MSLB
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Selenium/HTML%20files/Sample14.html");
		 driver.manage().window().maximize();
		
		 WebElement listBox = driver.findElement(By.id("A1"));
		 Select select=new Select(listBox);
		
		 int count=select.getOptions().size();
		 //select all the options
		 for(int i=0;i<count;i++) {
		 select.selectByIndex(i);
		 }
		
		 select.deselectAll();
		
		 //select all the options in reverse order
		 for(int i=count-1;i>=0;i--) {
			 select.selectByIndex(i);
			 }
		 
		//deselect all the options in reverse order
		 for(int i=count-1;i>=0;i--) {
			 select.deselectByIndex(i);
			 }
		 
		 //select all the alternative options
		 for(int i=0;i<count;i+=2) {
			 select.selectByIndex(i);
			 }
		 
		 Thread.sleep(1000);
		 driver.quit();
	}

}

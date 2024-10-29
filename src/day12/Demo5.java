package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Selenium/HTML%20files/Sample8.html");
		
		boolean selected = driver.findElement(By.id("A5")).isSelected();
		System.out.println(selected);//true--> check box is selected
		
		selected = driver.findElement(By.id("A6")).isSelected();
		System.out.println(selected);//false--> check box is NOT selected
		
		driver.quit();
		
	}

}

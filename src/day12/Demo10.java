package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10 {
//getSize(),getHeight(),getWidth(),getLoaction()
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Selenium/HTML%20files/Sample8.html");
		WebElement okButton = driver.findElement(By.id("A7"));
		
		int h = okButton.getSize().getHeight();
		System.out.println("Height:"+h);
		
		int w = okButton.getSize().getWidth();
		System.out.println("Width:"+w);
		
		int x= okButton.getLocation().getX();
		System.out.println("x:"+x);
		
		int y= okButton.getLocation().getY();
		System.out.println("y:"+y);
		
		driver.quit();
		
		
		
	}

}
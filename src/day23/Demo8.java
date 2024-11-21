package day23;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
//write a script to find the time taken to load the page
public class Demo8 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		long start = System.currentTimeMillis();//start the clock
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		long end = System.currentTimeMillis();//stop the clock
		double diff=(end-start)/1000.0;//milisecs to secs
		System.out.println("Time taken to load the page is:"+diff+"s");
		driver.quit();
	}

}

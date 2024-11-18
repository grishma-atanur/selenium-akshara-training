package day22;
//we cannot use implicitlywait() other than findElement and findElements()
//so we have to use explicit wait
//for other methods we need to use explicit wait(WebDriverWait() with Wait.until()
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo3 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));//only creating object here and set the time to wait 
	
	driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Selenium/HTML%20files/Sample17.html");
	
	driver.findElement(By.id("ok")).click();
	wait.until(ExpectedConditions.alertIsPresent());//waiting condition-actual waiting here
	
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	
	driver.findElement(By.id("ok")).click();
	wait.until(ExpectedConditions.alertIsPresent());
	
	alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	
	driver.quit();

	}

}

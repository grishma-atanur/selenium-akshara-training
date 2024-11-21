package day23;
//FluentWait is parent of WebDriverWait
//FluentWait is generic class that provides a flexible waiting mechanism
import java.time.Duration;
import java.util.Collection;
//WebDriverWait is readymade wait, if u want any custmisation , u have to use
//FluentWait
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo5 {
	//Solution for NSEE:Solution 4: FluentWait
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);//here <WebDriver> is generic type 
		//parameter, it tells FluentWait that it will be working with objects of type WebDriver
		wait.withTimeout(Duration.ofSeconds(10));//maximum time for waiting
		wait.pollingEvery(Duration.ofSeconds(1));//poll every 1sec untill 10secs are over
		wait.ignoring(NoSuchElementException.class);//ignore NSEE if it occurs	
		wait.ignoring(ElementNotInteractableException.class);
		//wait.ignoreAll(Collection<Class<? extends K>>)-we also have ignore all exceptions
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		driver.findElement(By.name("username")).sendKeys("admin");
		
	}

}

package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
//<a id="a1" name="n1" class="c1" title="click me" href="http://www.google.com">Google</a>
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/selenium-notes/Sample3.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.tagName("a"));
		element.click();
		Thread.sleep(2000);
		driver.quit();
		// this is example comment.
	}

}

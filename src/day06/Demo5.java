package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 
{//<a id="a1" name="n1" class="c1" title="click me" href="http://www.google.com">Google</a>
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("file:///E:/B115%207PM%20Selenium/share/pages/Sample3.html");
		Thread.sleep(1000);
		driver.findElement(By.id("a1")).click();
	}

}

package day04;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");

		driver.manage().window().setSize(new Dimension(500,600));
	
		Thread.sleep(1000);
		int x=100;
		for(int i=1;i<=10;i++)
		{
			driver.manage().window().setPosition(new Point(x,10));
			x=x+100;
			Thread.sleep(200);
		}
		
		int y=100;
		for(int i=1;i<=10;i++)
		{
			driver.manage().window().setPosition(new Point(x,y));
			y=y+100;
			Thread.sleep(200);
		}
		
		for(int i=1;i<=10;i++)
		{
			driver.manage().window().setPosition(new Point(x,y));
			y=y-100;
			Thread.sleep(200);
		}
		
		for(int i=1;i<=10;i++)
		{
			driver.manage().window().setPosition(new Point(x,10));
			x=x-100;
			Thread.sleep(200);
		}
		x=100;
		y=100;
		for(int i=1;i<=10;i++)
		{
			driver.manage().window().setPosition(new Point(x,y));
			x=x+100;
			y=y+100;
			Thread.sleep(200);
		}
		for(int i=1;i<=10;i++)
		{
			driver.manage().window().setPosition(new Point(x,y));
			x=x-100;
			y=y-100;
			Thread.sleep(200);
		}
		Thread.sleep(1000);
		
		driver.quit();
	}
}

package day04;
//setSize,Point, getX(), getY()
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
//get the current location /position of the browser
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");

		driver.manage().window().setSize(new Dimension(500,600));
	
		Thread.sleep(1000);
		
		Point p = driver.manage().window().getPosition();
		System.out.println(p);
		System.out.println(p.getX());
		System.out.println(p.getY());
		driver.quit();
	}
}

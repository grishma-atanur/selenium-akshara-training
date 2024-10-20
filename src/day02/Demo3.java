package day02;
//Different method for each browser-tedious
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {

	public static void test1(ChromeDriver driver)
	{
		driver.get("http://www.google.com");
		driver.quit();
	}
	
	public static void test1(FirefoxDriver driver)
	{
		driver.get("http://www.google.com");
		driver.close();
	}
	
	public static void test1(EdgeDriver driver)
	{
		driver.get("http://www.google.com");
		driver.close();
	}
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		Demo3.test1(driver);
		
		FirefoxDriver driver2=new FirefoxDriver();
		Demo3.test1(driver2);
		
		EdgeDriver driver3=new EdgeDriver();
		Demo3.test1(driver3);
	}
}

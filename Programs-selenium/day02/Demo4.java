package day02;
//improvissation of program2-using just one method for all browser
//upcasting all browser driver to RemoteWebDriver
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo4 {

	
	public static void test(RemoteWebDriver driver)
	{
		driver.get("http://www.google.com");
		driver.quit();
	}
	public static void main(String[] args)
	{
		RemoteWebDriver driver=new ChromeDriver();
		Demo4.test(driver);
		
		RemoteWebDriver driver2=new FirefoxDriver();
		Demo4.test(driver2);
		
		RemoteWebDriver driver3=new EdgeDriver();
		Demo4.test(driver3);
	}
}

package day24;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//StaleElementReferenceException-invalid username and password
public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		OrangeLoginPage p=new OrangeLoginPage(driver);
		p.setUserName("abcd");//invalid credentials
		p.setPassword("xyz");//invalid credentials
		p.clickLoginButton();//click login button
		Thread.sleep(4000);
		p.setUserName("admin");
		p.setPassword("admin123");
		p.clickLoginButton();
		Thread.sleep(4000);
		driver.quit();
	}
}

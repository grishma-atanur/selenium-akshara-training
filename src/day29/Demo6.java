package day29;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo6 {

	public static void main(String[] args) throws MalformedURLException {
		String gridURL="https://oauth-atanur.grishma-8a168:67b7ea2b-fbc3-4d71-8f04-0fde1233d918@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
		URL url=new URL(gridURL);
		ChromeOptions options=new ChromeOptions();
		
		WebDriver driver=new RemoteWebDriver(url,options);
		driver.get("https://aksharatraining.com/");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}

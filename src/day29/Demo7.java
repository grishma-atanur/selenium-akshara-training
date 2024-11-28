package day29;
//Username and Access key will be found in User Setting in Saucelabs
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
//Below code is copied from sauceLabs-->Go to SauceLabs-->Automated-->Pl-
//atform Configurator-->select OS, Browser , Selenium4--code will be generated-->
//scroll down-->Copy to clipboard-paste it in script-->modify accordingly
public class Demo7 {

	public static void main(String[] args) throws MalformedURLException {
		
		FirefoxOptions browserOptions = new FirefoxOptions();
		browserOptions.setPlatformName("Linux");
		browserOptions.setBrowserVersion("latest");
		Map<String, Object> sauceOptions = new HashMap<>();
		sauceOptions.put("username", "oauth-atanur.grishma-8a168");
		sauceOptions.put("accessKey", "67b7ea2b-fbc3-4d71-8f04-0fde1233d918");
		sauceOptions.put("build", "B115");
		sauceOptions.put("name", "TestAkshara");
		browserOptions.setCapability("sauce:options", sauceOptions);
		//start the session
		URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		WebDriver driver = new RemoteWebDriver(url, browserOptions);
		
		driver.get("https://aksharatraining.com/");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}

package day30;
//Eclipse-Local System.
//Command Prompt represents Remote System :remote folder
//In reality, eclipse will be in different computer and Command Prompt(Remote System ) will be in different computer. 
//we should RUN  local system.
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo1 {

	public static void main(String[] args) throws Exception {
//code optimisation used of day29-Demo6
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.129.7:4444"),new ChromeOptions());//Open Remote computer in Chrome Browser
		//the above URL is copy pasted from  cmd prompt(after runningjava -jar selenium-server-4.25.0.jar standalone)
		driver.get("https://aksharatraining.com/");//enter the URL in Browser
		System.out.println(driver.getTitle());
		Thread.sleep(5000);		
		driver.quit();


	}

}

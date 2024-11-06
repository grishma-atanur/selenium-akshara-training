package day14;
//executeScript() method from JavascriptExecutor interface
//scrolldown vertically up and down 10times down and 5times up
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://aksharatraining.com/");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		for(int i=1;i<=5;i++) {
		j.executeScript("window.scrollBy(0,500)");//scroll down
		Thread.sleep(1000);
		}
		
		for(int i=1;i<=5;i++) {
			j.executeScript("window.scrollBy(0,-500)");//scroll up
			Thread.sleep(1000);
			}
		driver.quit();
	}
}

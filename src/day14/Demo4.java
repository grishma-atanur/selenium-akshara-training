package day14;
//scrollBy(x,y), scrollTo(x,y)
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://aksharatraining.com/");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		j.executeScript("window.scrollBy(0,1000)");//down to 1000
		Thread.sleep(2000);
		
		j.executeScript("window.scrollBy(0,3000)");//down to +3000 --> 4000
		Thread.sleep(2000);
		
		j.executeScript("window.scrollTo(0,1000)");//up by 3000--> 1000
		Thread.sleep(2000);
		
		driver.quit();
	}
}

package day04;
//Webelement, switchTo().activeElement()
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		WebElement element = driver.switchTo().activeElement();
		element.sendKeys("Grishma");
		
//		driver.quit();

	}

}

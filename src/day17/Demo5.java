package day17;
//selenium supports Absolute path not relative path, but in mac couldnt use Absolute path
//see Demo6 and Demo7
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Workspace/selenium-akshara-training/src/day17/Sample10.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("A2")).sendKeys("E:/MyCV2.docx");//Absolute path
		driver.findElement(By.id("A2")).sendKeys("E:/MyCV2.docx");
		

		
		
	}
}

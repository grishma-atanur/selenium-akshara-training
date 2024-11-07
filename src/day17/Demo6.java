package day17;
//Relative path not supported - WebDriver exception
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Workspace/selenium-akshara-training/src/day17/Sample10.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
//		driver.findElement(By.id("A2")).sendKeys("E:/MyCV.docx");// absolute path of the file
		driver.findElement(By.id("A2")).sendKeys("./doc/MyCV.docx");//relative path of the file
	}
}

package day17;
//Relative  Path not supported in all laptops
//so convert Relative path Absolute path
//getAbsolutepath()
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/viresh/Downloads/Sample10.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
//		driver.findElement(By.id("A2")).sendKeys("E:/MyCV.docx");// absolute path of the file
		File file=new File("./doc/MyCV.docx");
		String absPath = file.getAbsolutePath();
		
		driver.findElement(By.id("A2")).sendKeys(absPath);//relative path of the file
	//WebDriverException: unknown error: path is not absolute: ./doc/MyCV.docx
	}
}

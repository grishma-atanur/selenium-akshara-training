package day19;
//Switching between tabs is same as switching between windows
//driver.switchTo.window(windowHandles)
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		String parent=driver.getWindowHandle();//this variable is created
		//to get back to parent window at last
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Thread.sleep(2000);
		Set<String> allTABS = driver.getWindowHandles();//addr of all tabs
		System.out.println(allTABS.size());//2
		
		for(String tab:allTABS)
		{
			driver.switchTo().window(tab);
			System.out.println(driver.getTitle());
		}
		
		driver.findElement(By.xpath("(//button[text()='Book a Free Demo'])[2]")).click();
		Thread.sleep(2000);
		driver.close();//close the 2nd tab
		Thread.sleep(1000);
		driver.switchTo().window(parent);
		driver.quit();
		
	}

}

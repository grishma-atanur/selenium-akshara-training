package day22;
//To show we need to use Thread.sleep() multiple times for synchronisation issue
//Thread.sleep() is blind wait coz it doesnt check whether element is present or not
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin");//enter username 
		driver.findElement(By.name("password")).sendKeys("admin123");//enter password
		driver.findElement(By.xpath("//button[@type='submit']")).click(); //click on login
		Thread.sleep(3000);//blind wait
		driver.findElement(By.cssSelector("li.oxd-userdropdown")).click();//inspect profile photo
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();//inspect logout button
		Thread.sleep(2000);
		driver.quit();
	}

}

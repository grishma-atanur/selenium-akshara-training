package day23;
//visibilityOfElementLocated()
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo4 {
	//Solution for NSEE:Solution 3:Explicit wait
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));//explicit wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));//checks if username 
		//is visible or not
		driver.findElement(By.name("username")).sendKeys("admin");
		
	}

}

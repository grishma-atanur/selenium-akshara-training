package day08;
//send keys(input) to text box
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Selenium/HTML%20files/Sample5.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[1]/input[1]")).sendKeys("a");
		driver.findElement(By.xpath("//div[1]/input[2]")).sendKeys("b");
		driver.findElement(By.xpath("//div[2]/input[1]")).sendKeys("c");
		driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("d");
		Thread.sleep(2000);
		driver.quit();

	}

}

//selenium example for encapsulation
//encapsulation-declaration,initialisation,utilisation
package day24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[text()='Accept all']")).click();
		 Thread.sleep(1000);
		
//		driver.findElement(By.id("APjFqb")).sendKeys("akshara training");
		
//		WebElement searchBox = driver.findElement(By.id("APjFqb"));-->Breaking this
		 //into ecapsulation steps below-declaration,initialisation,utilisation
//		searchBox.sendKeys("akshara training");
		
		WebElement searchBox;//declaration
		searchBox = driver.findElement(By.id("APjFqb"));//initialization
		searchBox.sendKeys("akshara training");//utilization

	}

}

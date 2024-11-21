package day24;
//Example for encapsulation in selenium
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class GooglePage
{
	private WebElement searchBox;  //declarartion
	
	GooglePage(WebDriver driver)
	{
		searchBox = driver.findElement(By.id("APjFqb")); //initialization
	}
	
	public void setSearchBox()
	{
		searchBox.sendKeys("akshara training"); //utilization
	}
	
}
public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[text()='Accept all']")).click();
		 Thread.sleep(1000);
		
		GooglePage g=new GooglePage(driver);
		g.setSearchBox();
		
		Thread.sleep(1000);
		
		driver.quit();
	}

}

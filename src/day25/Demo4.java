package day25;
//if we dont initialize that is in POM class we dont use constructor then we get
//NULLPointer Exception
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class GooglePage1
{
	@FindBy(id="APjFqb")	//Declaration
	private WebElement searchBox;
	
	//No initisation-No constructor
	
	public void setSearchBox()  //utilisation
	{
		searchBox.sendKeys("akshara training");
	}
	
}
public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[text()='Accept all']")).click();
		 Thread.sleep(1000);
		
		GooglePage1 g=new GooglePage1();
		g.setSearchBox();
		
		Thread.sleep(1000);
		
		driver.quit();
	}

}

package day25;
//Page Object Model(POM) to handle staleElementReferenceExeption
//this program is same as day24-->Demo3 but changed to POM
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class GooglePage
{
	@FindBy(id="APjFqb")		//Declaration
	private WebElement searchBox;
	
	GooglePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this ); //initialization
	}
	
	public void setSearchBox()	//no change in methods
	{
		searchBox.sendKeys("akshara training");
	}
	
}
public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		GooglePage g=new GooglePage(driver);
		g.setSearchBox();
		
		Thread.sleep(1000);
		
		driver.quit();
	}

}

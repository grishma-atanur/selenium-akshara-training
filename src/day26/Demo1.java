package day26;
//Handling multiple elements in POM(Page Object Model)-->>using @FindBy only
//but data type should be List<WebElement>
//Print all links of Google page
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class GooglePage {
	@FindBy(xpath = "//a") // line 14 and line 15 is equvivalent to 
	//driver.findElements() method
	private List<WebElement> allLinks;

	GooglePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void printLinks() {
		int count = allLinks.size();
		System.out.println(count);

		for (WebElement link : allLinks) {
			System.out.println(link.getText());
		}
	}
}

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Accept all']")).click();
		Thread.sleep(1000);
		GooglePage g = new GooglePage(driver);
		g.printLinks();
		driver.quit();

	}

}

package day15;
//Double click  and print before and after color
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Demo7 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo.php");
		driver.manage().window().maximize();
		
		WebElement before = driver.findElement(By.id("box"));
		String beforeColor =before.getCssValue("background-color");
		System.out.println(beforeColor);
		
		WebElement button = driver.findElement(By.xpath("//input[@value='Double Click']"));
		Actions actions=new Actions(driver);
		actions.doubleClick(button).perform();
		
		WebElement after = driver.findElement(By.id("box"));
		String afterColor = after.getCssValue("background-color");
		System.out.println(afterColor);
		
		
	}

}

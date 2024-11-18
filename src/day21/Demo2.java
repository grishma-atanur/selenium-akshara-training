package day21;
//To show the exception-If we use deselect  method on single select list box
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		 driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Selenium/HTML%20files/Sample14.html");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 
		 WebElement listBox = driver.findElement(By.id("A1"));
		 Select select=new Select(listBox);
		 System.out.println(select.isMultiple());//false
		 
		 try 
		 {
			 select.deselectByIndex(0);
		 }
		 catch (Exception e)
		 {
			e.printStackTrace();
		 }
		 
		 Thread.sleep(1000);
		 driver.quit();

	}

}

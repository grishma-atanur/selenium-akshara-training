package day12;
//isSelected
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/viresh/Documents/Grishma/Akshara%20Training/Selenium/HTML%20files/Sample8.html");
		
		boolean visible = driver.findElement(By.id("A1")).isDisplayed();
		System.out.println(visible);//true --> element is displayed/visible
		
		visible = driver.findElement(By.id("A3")).isDisplayed();
		System.out.println(visible);//false --> element is not displayed/invisible
		try {
		driver.findElement(By.id("A3")).click();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		driver.quit();
	}

}

package day03;
//gettitle(), getCurrentUrl, getPageSource
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		
		String title = driver.getTitle();//utmost top most of page
		System.out.println(title);
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		

		String htmlCode = driver.getPageSource();//get source code of page
		System.out.println(htmlCode);
		
		driver.quit();
	}

}

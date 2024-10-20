package day04;
//Dimension,getSize(), getWidth(), getHeight()
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
//get the default size of the browser 
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		Dimension d = driver.manage().window().getSize();
		System.out.println(d);
		
		int w = d.getWidth();
		System.out.println("Width:"+w);
		
		int h = d.getHeight();
		System.out.println("Height:"+h);
	
		driver.quit();
	}

}

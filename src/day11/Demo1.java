package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {

				WebDriver driver= new ChromeDriver();

				driver.get("https://pos.aksharatraining.in/pos/public/#");
			
				driver.findElement(By.id("input-username")).sendKeys("admin");
			
				driver.findElement(By.id("input-password")).sendKeys("pointofsale");
				
				driver.findElement(By.name("login-button")).click();
				

	}

}

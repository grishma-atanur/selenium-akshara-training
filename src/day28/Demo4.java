package day28;
//Perform verification using assert(Not if else)
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {

	@Test
	public void testA()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		String actual=driver.getTitle();
		String expected="Google";
//		if(title.equals("Google"))
//		{
//			Reporter.log("Pass: Google page is displayed",true);
//		}
//		else
//		{
//			Reporter.log("Fail: Google page is Not displayed",true);
//			Assert.fail(); //you are telling TestNG , In the TestNG report
		//you change the status from Pass to Fail.
		//When u use Assert,fail(), it will fail y throwing Assertion error.
//		}
		Assert.assertEquals(actual,expected);//instead of if else block we can use this
	
		
	}
}

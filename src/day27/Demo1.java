package day27;
//Print Message
//This is a testNG class which contains @Test method instead of Main method
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void m1()
	{
		System.out.println("m1 of Demo1");//print only in console
		Reporter.log("***m1 of Demo1***");//print only in html report
		Reporter.log("$$$m1 of Demo1$$$",true);//Print both in console and html report
	}
}

package day28;
//child of BaseClass
//This is a TestNG class
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 extends BaseClass
{

	@Test
	public void testB()
	{
		Reporter.log("@TestB",true);
	}
}

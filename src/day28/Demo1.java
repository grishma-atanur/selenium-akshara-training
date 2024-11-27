package day28;
//child of BaseClass
//This is a TestNG class
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 extends BaseClass
{

	@Test
	public void testA()
	{
		Reporter.log("@TestA",true);
	}
}

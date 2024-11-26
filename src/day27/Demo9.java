package day27;
//@dataProvider is used to run tests multiple times with different data.
// how to run test multiple times without @dataProvider & for loop --> invocationCount
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo9 {

	@Test(invocationCount = 3)
	public void m1()
	{
		Reporter.log("m1",true);
	}
}

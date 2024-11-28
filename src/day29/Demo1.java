package day29;
//deleteCustomer() test case should execute only if createCustomer()
//test case is successful.-->for this we use "dependsOnMethods".
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void createCustomer()
	{
		Reporter.log("Create Customer",true);
		Assert.fail();//imagine create customer is failed
	}
	//In this case deleteCustomer() is neither passes nor failed
	//it is skipped
	@Test(dependsOnMethods = "createCustomer")
	public void deleteCustomer()
	{
		Reporter.log("Delete Customer",true);
	}
}

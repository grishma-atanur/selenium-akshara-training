package day27;
//Demo10 program using inheritance
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo11Child extends Demo11Parent
{
	@Test
	public void createCustomer()
	{
		Reporter.log("Create Customer",true);
	}
	
	@Test
	public void deleteCustomer()
	{
		Reporter.log("Delete Customer",true);
	}
}
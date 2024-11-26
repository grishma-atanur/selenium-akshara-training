package day27;
//BeforeMethod-Means execute before every test method
//AfterMethod-Means execute after every test method
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo10 {

	@BeforeClass
	public void openApp() {
		Reporter.log("openApp",true);
	}
	
	@AfterClass
	public void closeApp()
	{
		Reporter.log("closeApp",true);
	}
	
	@BeforeMethod
	public void login()
	{
		Reporter.log("Login",true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("Logout",true);
	}
	
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

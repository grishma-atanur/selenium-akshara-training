package day29;
//testng8.xml
//Parameter is commented in xml file
//since parameter is commented in xml file, we can run directly from here(Test class)
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo3 {

	@Parameters("city")//If city is not received ,
	//It will pick Optional value
	
	@Test
	public void testA(@Optional("Mysore") String c)
	{
		Reporter.log("testA:"+c,true);
	}
}

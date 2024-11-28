package day29;
//testng7.xml
//parameter option in xml file
//Once you use parameter,you cannot run TestNG class directly we will get error
//If u use parameter, always Run Xml file 
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo2 {

	@Parameters("city")//Parameter option from xml file is
	//used like this here-receiving city here from xml file
	@Test
	public void testA(String c)//send city to this as method argument
	{
		Reporter.log("testA:"+c,true);
	}
}

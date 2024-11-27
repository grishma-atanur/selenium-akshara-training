package day29;
//testng9.xml
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo4 {

	@Parameters({"city","pin"})
	@Test
	public void testA(@Optional("Pune") String c,@Optional("100") String p)
	{
		Reporter.log("testA:"+c+p,true);
	}
}

package day28;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo5 {

	@Test
	public void testA()
	{
		Reporter.log("StepA1",true);
		Assert.assertEquals("hi","hi");
		Reporter.log("StepA2",true);
	}
	
	@Test
	public void testB()
	{
		Reporter.log("StepB1",true);
		Assert.assertEquals("hi","bye");//if assert is failed-exit the test-
		//it will not execute remaining code of the test
		
		Reporter.log("StepB2",true);
	}
	
	@Test
	public void testC()
	{
		//softassert is non-static method
		Reporter.log("StepC1",true);
		SoftAssert softAssert=new SoftAssert();//if assert is failed-doesnt exit the test-
		//it will  execute remaining code of the test
		
		softAssert.assertEquals("hi","bye");
		Reporter.log("StepC2",true);
		softAssert.assertAll();//whenever you use SoftAssert, you must use
		//assertAll(); otherwise SoftAssert doesnt work.
	}
}

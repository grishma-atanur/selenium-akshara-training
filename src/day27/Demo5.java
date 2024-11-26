package day27;
//If u declare as object you can receive any datatype
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo5 {

	@DataProvider
	public Object[] getData()
	{
		Object[] a= new Object[3];
		a[0]="Apple"; //upcasted to object
		a[1]=10;//upcasted to object
		a[2]=true;//upcasted to object
		
		return a;
	}
	@Test(dataProvider = "getData")
	public void testA(Object e)
	{
		String s=""+e;//Reporter.log will only accept string as first argument 
		//so we need to convert e into string
		Reporter.log(s,true); 
	}

}

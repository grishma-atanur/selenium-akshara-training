package day27;
//Issue with Array is size is fixed, so TestNG will support Collection too.
//ArrayList<String> is a collection-->we can increase or decrease size
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo7 {

	@DataProvider
	public Iterator<String>  getData()
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("Apple");
		a.add("Banana");
		a.add("Chiku");
		a.add("Grapes");
		Iterator<String> v = a.iterator();//required for looping purpose
		return v;
	}
	@Test(dataProvider = "getData")
	public void testA(String s)
	{
		Reporter.log(s,true);
	}

}

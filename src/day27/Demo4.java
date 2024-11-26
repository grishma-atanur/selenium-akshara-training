package day27;
//To create testNG class-->right click on Package-->TestNG-->Create TestNG class
//To run the test multiple times with different data we use DataProvider
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo4 {

	@DataProvider
	public String[] getData()  //DataProvider method-->A method which provided data
	{
		String[] a= new String[4];
		a[0]="Apple";
		a[1]="Mango";
		a[2]="Banana";
		a[3]="Grapes";
		
		return a;
	}
	@Test(dataProvider = "getData")
	public void testA(String fruit)  //Test Method-->TestNG will run Test method 3times
	//automatically and each time TestNG will only pass respective element
	//from the array-for loop not required
	{
		Reporter.log(fruit,true);
	}

}

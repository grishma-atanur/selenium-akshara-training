package day25;
//converting OrangeLoginPage.java into POM class to handle StaleElementReferenceException
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeLoginPage2
{
	@FindBy(name="username")
	private WebElement userName;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	OrangeLoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);//instead of writing 3 findElements
		//we can write just one initElements which initializes all 3 elements
		
		
	}
	
	public void setUserName(String un)
	{
		userName.sendKeys(un);//Handled staleElementReferenceException-when control
		//comes here it internally runs findElement once again after refresh
		//to get new address of the element username
	}
	
	public void setPassword(String pw)
	{
		password.sendKeys(pw);
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
}
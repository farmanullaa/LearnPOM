package pages;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod 
{
	public LoginPage enterUserName()
	{
		driver.findElementById("username").sendKeys("DemoSalesManager");
		return this;
	}
	
	public LoginPage enterPassowrd() 
	{
		driver.findElementById("password").sendKeys("crmsfa");
		return this;
	}
	
	public HomePage clickLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage(); 
	}
}

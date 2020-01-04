package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC001_LoginLogout extends ProjectSpecificMethod 
{
	@Test
	public void tc001_LoginLogout()
	{
		new LoginPage()
		.enterUserName()
		.enterPassowrd()
		.clickLogin()
		.clickCRMSFA();
		
		
	}
}

package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.CreateLeadPage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.ViewLeadPage;

public class TC002_CreateLead extends ProjectSpecificMethod 
{
	@Test
	public void tc001_LoginLogout()
	{
		new LoginPage()
		.enterUserName()
		.enterPassowrd()
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterFirstName()
		.enterLastName()
		.enterCompanyName()
		.clickCreateLeadButton()
		.checkFirstName();
		
		
		
	}
}

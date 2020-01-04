package pages;

import base.ProjectSpecificMethod;

public class MyLeadsPage extends ProjectSpecificMethod 
{
	public CreateLeadPage clickCreateLead()
	{
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}
	
	
}

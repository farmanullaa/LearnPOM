package pages;

import base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod 
{
	public MyLeadsPage clickLeads()
	{
		driver.findElementByLinkText("Leads").click();
		return new MyLeadsPage();
	}
	
	
}

package pages;

import base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod 
{
	
	public ViewLeadPage checkFirstName()
	{
		String fname =  driver.findElementById("viewLead_firstName_sp").getText();
		if (fname.contains("Fara"))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		return this;
	}
	
	
	
}

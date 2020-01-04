package pages;

import base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod 
{
	
	public CreateLeadPage enterFirstName()
	{
		driver.findElementById("createLeadForm_firstName").sendKeys("Farmanulla");
		return this;
	}
	
	public CreateLeadPage enterLastName() 
	{
		driver.findElementById("createLeadForm_lastName").sendKeys("Ahamed");
		return this;
	}
	
	public CreateLeadPage enterCompanyName() 
	{
		driver.findElementById("createLeadForm_companyName").sendKeys("Unique");
		return this;
	}
	
	public ViewLeadPage clickCreateLeadButton()
	{
		driver.findElementByClassName("smallSubmit").click();
		return new ViewLeadPage(); 
	}
	
	
}

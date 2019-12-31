package pages;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	public CreateLeadPage enterCompanyname(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		return this;
	}
	
	public CreateLeadPage enterFirstname(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		return this;
	}
	
	public CreateLeadPage enterLastname(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		return this;
	}
	
	public ViewLeadPage clickCreateLead() {
		driver.findElementByName("submitButton").click();
		return new ViewLeadPage();
	}
}

package pages;

import base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {

	public EditLeadPage enterNewCompanyName(String newCompanyName) {
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys(newCompanyName);
		return this;
	}

	public EditLeadPage enterNewFirstName(String newFirstName) {
		driver.findElementById("updateLeadForm_firstName").clear();
		driver.findElementById("updateLeadForm_firstName").sendKeys(newFirstName);
		return this;
	}

	public EditLeadPage enterNewLastName(String newLastName) {
		driver.findElementById("updateLeadForm_lastName").clear();
		driver.findElementById("updateLeadForm_lastName").sendKeys(newLastName);
		return this;
	}

	public ViewLead clickEditUpdateButton() {
		driver.findElementByClassName("smallSubmit").click();
		System.out.println("Create lead performed successfully");
		return new ViewLead();
	}

}

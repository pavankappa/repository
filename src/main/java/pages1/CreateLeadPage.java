package pages;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {

	public CreateLeadPage enterCompanyName(String companyName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
		return this;
	}

	public CreateLeadPage enterfName(String firNam) {
		driver.findElementById("createLeadForm_firstName").sendKeys(firNam);
		return this;
	}

	public CreateLeadPage enterlName(String lstNam) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lstNam);
		return this;
	}

	public ViewLead clickCreateLeadButton() {
		driver.findElementByClassName("smallSubmit").click();
		System.out.println("Create lead performed successfully");
		return new ViewLead();

	}

}

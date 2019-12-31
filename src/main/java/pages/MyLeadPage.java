package pages;

import base.ProjectSpecificMethods;

public class MyLeadPage extends ProjectSpecificMethods{
	public CreateLeadPage clickCreateLeadTab() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}

}

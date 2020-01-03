package pages;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {

	public CreateLeadPage clickCreateLeadTab() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}



	public MergeLeadPage clickMergeLeadTab() {
		driver.findElementByLinkText("Merge Leads").click();
		return new MergeLeadPage();
	}
}

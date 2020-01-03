package pages;

import base.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods {
	
	public ViewLead clickDuplicatePageCreateLeadButton() {
		driver.findElementByClassName("smallSubmit").click();
		System.out.println("Duplicate lead performed successfully");
		return new ViewLead();

	}
}

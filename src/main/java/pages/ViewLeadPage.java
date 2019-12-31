package pages;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	public void getFirstName(String vFName) {
		String text = driver.findElementById("viewLead_firstName_sp").getText();
		if (text.contains(vFName)) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead creation failed");
		}
	}
}

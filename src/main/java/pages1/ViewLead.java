package pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;

public class ViewLead extends ProjectSpecificMethods {

	public ViewLead verifyCreatedLead(String verifyName) {

		String firstName = driver.findElementById("viewLead_firstName_sp").getText();

		if (firstName.equals(verifyName)) {
			System.out.println("First Name displaying correctly as " + firstName);
		} else {
			System.out.println("First Name not matched");
		}
		return this;

	}

	public EditLeadPage clickEditButton() {
		driver.findElementByLinkText("Edit").click();
		return new EditLeadPage();
	}

	public MyLeadsPage clickDeleteButton() {
		driver.findElementByLinkText("Delete").click();
		return new MyLeadsPage();
	}

	public DuplicateLeadPage clickDuplicateLeadButton() {
		driver.findElementByLinkText("Duplicate Lead").click();
		return new DuplicateLeadPage();
	}
	
	public FindLeadPage clickFindLeadTab() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadPage();
	}
	public ViewLead verifyNewEditedCompanyName(String verifyNewCompanyName) {

		String newEditedCompanyName = driver.findElementById("viewLead_companyName_sp").getText();

		if (newEditedCompanyName.contains(verifyNewCompanyName)) {
			System.out.println("Newly Edited Company Name displaying correctly as " + newEditedCompanyName);
		} else {
			System.out.println("Company Name not matched");
		}
		return this;
	}

	public ViewLead verifyNewEditedLeadFirstName(String verifyNewLeadFirstName) {
		String newEditedLeadFirstName = driver.findElementById("viewLead_firstName_sp").getText();

		if (newEditedLeadFirstName.equals(verifyNewLeadFirstName)) {
			System.out.println("Newly Edited Lead First Name displaying correctly as " + newEditedLeadFirstName);
		} else {
			System.out.println("First Name not matched");
		}
		return this;

	}

	public ViewLead verifyNewEditedLeadLastName(String verifyNewLeadLastName) {

		String newEditedLeadLastName = driver.findElementById("viewLead_lastName_sp").getText();

		if (newEditedLeadLastName.equals(verifyNewLeadLastName)) {
			System.out.println("Newly Edited Lead Last Name displaying correctly as " + newEditedLeadLastName);
		} else {
			System.out.println("Last Name not matched");
		}
		return this;

	}

}

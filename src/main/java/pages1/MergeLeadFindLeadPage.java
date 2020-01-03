package pages;

import base.ProjectSpecificMethods;

public class MergeLeadFindLeadPage extends ProjectSpecificMethods {
	
	public MergeLeadFindLeadPage enterFindLeadsID(String firstID) {
		driver.findElementByXPath("//input[@name='id']").sendKeys(firstID);
		return this;
	}

	public MergeLeadFindLeadPage enterMergeLeadFindLeadPageFirstName(String fName) {
		driver.findElementByXPath("//*[@id=\"ext-gen27\"]").sendKeys(fName);
		return this;
	}


	public MergeLeadFindLeadPage clickMegerLeadFindLeadPageFindLeadsButton() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		return this;
	}

	public MergeLeadPage clickFirstID() {
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		return new MergeLeadPage();
	}
}
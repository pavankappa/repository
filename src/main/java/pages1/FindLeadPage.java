package pages;

import base.ProjectSpecificMethods;

public class FindLeadPage extends ProjectSpecificMethods {

	public FindLeadPage enterFindLeadsFirstName(String fName) {
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(fName);
		return this;
	}

	public FindLeadPage clickFindLeadsPageFindLeadsButton() {
		driver.findElementByXPath("(//*[@class='x-panel-btn-td'])[6]").click();
		return this;
	}

	public MyLeadsPage getFirstLeadID() throws InterruptedException {
		Thread.sleep(4000);
		String firstID = driver.findElementByXPath("//table/tbody/tr[1]/td[1]/div/a").getText();
		System.out.println(firstID);
		return new MyLeadsPage();
	}
	
	public MyLeadsPage getSecondLeadID() throws InterruptedException {
		Thread.sleep(4000);
		String secondID = driver.findElementByXPath("//table/tbody/tr[1]/td[1]/div/a").getText();
		System.out.println(secondID);
		return new MyLeadsPage();
	}

}

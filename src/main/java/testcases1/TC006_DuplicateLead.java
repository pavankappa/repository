package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC006_DuplicateLead extends ProjectSpecificMethods {
	@BeforeClass
	public void setData() {
		excelFileName = "TC006DuplicateLead";
	}

	@Test(dataProvider="getData")
	
	public void tc006_duplicateLead(
	String uName, String passWord,
	String cName, String fName, 
	String lName, String verifyName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(passWord)
		.clickLoginButton()
		.verifyLogin()
		.clickCRMSFAicon()
		.clickLeadsButton()
		.clickCreateLeadTab()
		.enterCompanyName(cName)
		.enterfName(fName)
		.enterlName(lName)
		.clickCreateLeadButton()
		.verifyCreatedLead(verifyName)
		.clickDuplicateLeadButton()
		.clickDuplicatePageCreateLeadButton();
	}
}

package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC005_DeleteLead extends ProjectSpecificMethods{

	
	@BeforeClass
	public void setData() {
		excelFileName = "TC005DeleteLead";

	}
	@Test(dataProvider="getData")
	public void tc005_DeleteLead(
			String uName, String passWord,
			String cName, String fName,
			String lName, String verifyName ) {
		
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
		.clickDeleteButton();

	}
}

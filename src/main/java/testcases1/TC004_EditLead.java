package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC004_EditLead extends ProjectSpecificMethods{
	@BeforeClass
	public void setData() {
		excelFileName = "TC004EditLead";
	}
	
	@Test(dataProvider="getData")
	public void tc004_EditLead(String uName, String passWord, String cName,
			String fName, String lName, String verifyName, String newCompanyName, 
			String newFirstName, String newLastName,
			String verifyNewCompanyName,
			String verifyNewLeadFirstName,
			String verifyNewLeadLastName) {
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
		.clickEditButton()
		.enterNewCompanyName(newCompanyName)
		.enterNewFirstName(newFirstName)
		.enterNewLastName(newLastName)
		.clickEditUpdateButton()
		.verifyNewEditedCompanyName(verifyNewCompanyName)
		.verifyNewEditedLeadFirstName(verifyNewLeadFirstName)
		.verifyNewEditedLeadLastName(verifyNewLeadLastName);
		
		
		

	}

}

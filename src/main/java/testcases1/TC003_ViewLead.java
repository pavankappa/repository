package testcases;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC003_ViewLead extends ProjectSpecificMethods{

	public void tc003_ViewLead(String uName, String passWord, String cName, String fName, String lName, String verifyName)
	{
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(passWord)
		.clickLoginButton()
		.clickCRMSFAicon()
		.clickLeadsButton()
		.clickCreateLeadTab()
		.enterCompanyName(cName)
		.enterfName(fName)
		.enterlName(lName)
		.clickCreateLeadButton()
		.verifyCreatedLead(verifyName);
	}
}

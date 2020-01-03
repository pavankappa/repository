package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC002_CreateLead extends ProjectSpecificMethods{


	@BeforeClass
	public void setData() {
		excelFileName = "TestData";
	}
	
	@Test(dataProvider="getData")
	
	public void tc002_CreateLead(String uName, String passWord, String cName, String fName, String lName, String verifyName) {
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
	.verifyCreatedLead(verifyName);
	}
	 

}

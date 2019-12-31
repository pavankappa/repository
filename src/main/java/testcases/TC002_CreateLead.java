package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC002_CreateLead extends ProjectSpecificMethods{
	@BeforeTest
	public void filename() {
		excelFilename = "TC002";
	}
	
	@Test(dataProvider = "getData")
	public void tc002_CreateLead(String uName, String pwd,String cName, String fName, String lName, String vFName) {
		new LoginPage()
		.enterUsername(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCrmsfa()
		.clickLead()
		.clickCreateLeadTab()
		.enterCompanyname(cName)
		.enterFirstname(fName)
		.enterLastname(lName)
		.clickCreateLead()
		.getFirstName(vFName);	
	}
}

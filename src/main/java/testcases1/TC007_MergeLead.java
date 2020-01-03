package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC007_MergeLead extends ProjectSpecificMethods{

	@BeforeClass
	public void setData() {
		excelFileName = "TC007MergeLead";
	}

	@Test(dataProvider="getData")
	
	public void tc007_mergeLead (String uName,
	String passWord, String cName,
	String fName, String lName,
	String verifyName, String comName,
	String fstName, String lstName,	String verifyIIName) throws InterruptedException {

			
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
.clickFindLeadTab()
.enterFindLeadsFirstName(fName)
.clickFindLeadsPageFindLeadsButton()
.getFirstLeadID()
.clickCreateLeadTab()
.enterCompanyName(comName)
.enterfName(fstName)
.enterlName(lstName)
.clickCreateLeadButton()
.verifyCreatedLead(verifyIIName)
.clickFindLeadTab()
.enterFindLeadsFirstName(fstName)
.clickFindLeadsPageFindLeadsButton()
.getSecondLeadID()
.clickMergeLeadTab()
.clickFromLeadImageButton()
.enterMergeLeadFindLeadPageFirstName(fName)
.clickMegerLeadFindLeadPageFindLeadsButton()
.clickFirstID()
.clickToLeadImageButton()
.enterMergeLeadFindLeadPageFirstName(fstName)
.clickMegerLeadFindLeadPageFindLeadsButton()
.clickFirstID();
	
	}
}

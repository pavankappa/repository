package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;


public class TC001_LoginLogout extends ProjectSpecificMethods{
	
	@BeforeClass
	public void setData() {
		excelFileName = "TestData";
	}
	
	@Test(dataProvider="getData")
	public void tc001_LoginLogout(String uName, String passWord) {
	new LoginPage()
	.enterUserName(uName)
	.enterPassword(passWord)
	.clickLoginButton()
	.verifyLogin()
	.clickLogout();
	}
	 

}

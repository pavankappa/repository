package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC001_LoginLogout extends ProjectSpecificMethods{
	@BeforeTest
	public void filename() {
		excelFilename = "TC001";

	}

	@Test(dataProvider = "getData")
	public void tc001_LoginLogout(String uname, String pwd) {
		new LoginPage()
		.enterUsername(uname)
		.enterPassword(pwd)
		.clickLogin()
		.verifyLogin()
		.clickLogout();
	}
}

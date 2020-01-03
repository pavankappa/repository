package pages;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	public LoginPage enterUserName(String uName) {
		driver.findElementById("username").sendKeys(uName);
		return this;
	}

	public LoginPage enterPassword(String passWord) {
		driver.findElementById("password").sendKeys(passWord);
		return this;
	}

	public HomePage clickLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	}

}

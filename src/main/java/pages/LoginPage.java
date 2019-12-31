package pages;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	public LoginPage enterUsername(String uName) {
		driver.findElementById("username").sendKeys(uName);
		return this;
	}
	
	public LoginPage enterPassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
		return this;
	}
	
	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	}

}

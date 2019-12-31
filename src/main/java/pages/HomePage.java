package pages;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	public HomePage verifyLogin() {
		String text = driver.findElementByTagName("h2").getText();
		if (text.contains("Demo")) {
			System.out.println("Testcase Passed");
			
		} else {
			System.out.println("Testcase failed");
		}
		return this;
		
	}
	
	public MyHomePage clickCrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();

	}
	public LoginPage clickLogout() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();

	}

}

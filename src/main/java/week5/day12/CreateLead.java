package week5.day12;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods{

	@BeforeTest
	public void fileName()
	{
		excelFilename = "createLead";
	}
	
	@Test(dataProvider="getData")
	public void createLead(String cName, String fName, String lName) {
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(fName);
		driver.findElementByName("submitButton").click();

	}
}







package day3.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		// Initiate the ChromeBroswer
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximize the browser
		driver.manage().window().maximize();		
		// Enter the UserName
		WebElement username = driver.findElementById("username");
		username.sendKeys("DemoSalesManager");
		// Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		// Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		// Click on crm/sfa button
		driver.findElementByLinkText("CRM/SFA").click();

		// Click on Leads
		driver.findElementByLinkText("Leads").click();
		// Click on Create Lead button
		driver.findElementByLinkText("Create Lead").click();
		// Enter Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("Kalyan Software");
		// Enter First Name
		driver.findElementById("createLeadForm_firstName").sendKeys("Kalyan");
		// Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("K");
		
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9494949494");
		
		// Click on Create Lead (Submit) button
		driver.findElementByName("submitButton").click();

		// Verify the Lead is created by checking the Company or First Name
		String cName = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(cName);
	}

}

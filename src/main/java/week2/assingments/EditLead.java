package week2.assingments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws Throwable
	{
		// Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		
		// Enter the username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		
		// Enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		// Click Login
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		// Click crm/sfa link
		//driver.findElementByXPath("//a[text(),'CRM/SFA']");
		driver.findElementByLinkText("CRM/SFA").click();
		
		// Click Leads link
		driver.findElementByLinkText("Leads").click();
		
		// Click Find leads
		driver.findElementByLinkText("Find Leads").click();
		
		// Enter first name
		driver.findElementById("ext-gen248").sendKeys("Pavan");
		
		// Click Find leads button
		driver.findElementById("ext-gen334").click();
		Thread.sleep(3000);
		// Click on first resulting lead
		driver.findElementByXPath("(//*[@class='linktext'])[4]").click();
		
		// Verify title of the page
		String pTitle = driver.getTitle();
		
		// if(pTitle=="View Lead | opentaps CRM")
		if(pTitle.contains("View Lead"))
		{
		System.out.println("Title of the Page is "+pTitle);
		}else {
			System.err.println("Title does not match");
		}
		
		// Click Edit
		driver.findElementByLinkText("Edit").click();
		
		// Change the company name
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Pavan Software Solutions");
		
		// Click Update
		driver.findElementByXPath("//input[@class='smallSubmit'][1]").click();
		
		// Confirm the changed name appears
		WebElement changedName = driver.findElementById("viewLead_companyName_sp");
		String compName = changedName.getText();
		
		if (compName.contains("Solutions")) {
			System.out.println("Company Name updated "+compName);
		}else {
			System.out.println("Company Name update failed");
		}
		
		driver.close();
	}
}
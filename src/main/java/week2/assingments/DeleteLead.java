package week2.assingments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class DeleteLead {
	
	public static void main(String[] args) throws InterruptedException {
		
	// Launch the browser
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leaftaps.com/opentaps/control/main");
	
	// Enter the username
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
	
	// Enter the password
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	
	// Click Login
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	
	Thread.sleep(2000);
	// Click crm/sfa link
	//driver.findElementByXPath("//a[text(),'CRM/SFA']");
	driver.findElementByLinkText("CRM/SFA").click();
	
	// Click Leads link
	driver.findElementByLinkText("Leads").click();
	
	// Click Find leads
	driver.findElementByLinkText("Find Leads").click();
	
	//Click on Phone
	driver.findElementByXPath("//span[text()='Phone']").click();
	
	//Enter phone number
	driver.findElementByName("phoneNumber").sendKeys("9494949494");
	
	// Click find leads button
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	
	// Capture lead ID of First Resulting lead
	
	String leadId = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']").getText();
	System.out.println(leadId);
	
	//Click First Resulting lead
	driver.findElementByXPath("//a[contains(text(),'+leadId+')]").click();
	
	// Click Delete
	driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
	
	// Click Find leads
	driver.findElementByLinkText("Find Leads").click();
	
	// Enter captured lead ID
	driver.findElementByXPath("//input[@class=' x-form-text x-form-field ']").sendKeys(leadId);
	
	// Click find leads button
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	
	// Click find leads button
	driver.findElementByXPath("//div[text()='No records to display']").getText();
	
	Thread.sleep(5000);
	driver.close();
	
	
	}
	
}

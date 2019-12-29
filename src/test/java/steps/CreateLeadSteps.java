package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadSteps {
	public ChromeDriver driver;
	@Given("Launch the Browser")
	public void launchTheBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("Maximise the Browser")
	public void maximiseTheBrowser() {
		driver.manage().window().maximize();
	}

	@Given("Load the URL")
	public void loadTheURL() {
		driver.get("http://leaftaps.com/opentaps/");
	}

	@Given("Enter username as (.*)")
	public void enterUsernameAsDemosalesmanager(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}

	@Given("Enter password as (.*)")
	public void enterPasswordAsCrmsfa(String password) {
		driver.findElementById("password").sendKeys(password);
	}

	@Given("click the Login button")
	public void clickTheLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Given("click on CRM\\/SFA")
	public void clickOnCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@Given("Click on Leads Tab")
	public void clickOnLeadsTab() {
		driver.findElementByLinkText("Leads").click(); 
	}

	@Given("Click on Create Lead Option")
	public void clickOnCreateLeadOption() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@Given("Enter the Company Name as (.*)")
	public void enterTheCompanyName(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}

	@Given("Enter the First Name as (.*)")
	public void enterTheFirstName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}

	@Given("Enter the Last Name as (.*)")
	public void enterTheLastName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}

	@When("Click on Create Lead")
	public void clickOnCreateLead() {
		driver.findElementByName("submitButton").click();
	}

	@Then("Verify Create lead is Successful")
	public void verifyCreateLeadIsSuccessful() {
	    System.out.println("Login Success");
	}
}

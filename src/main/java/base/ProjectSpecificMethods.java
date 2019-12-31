package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;

public class ProjectSpecificMethods {
	public String excelFilename;
	public static ChromeDriver driver;
	
	@BeforeMethod
	//@Parameters({"url","username","password"})
	//public void launch(String url,String uname,String pwd) {
	public void launch() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		/*
		 * driver.findElementById("username").sendKeys(uname);
		 * driver.findElementById("password").sendKeys(pwd);
		 * driver.findElementByClassName("decorativeSubmit").click();
		 * driver.findElementByLinkText("CRM/SFA").click();
		 * driver.findElementByLinkText("Leads").click();
		 */
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	@DataProvider()
	public String[][] getData() throws IOException {
		return new ReadExcel().readExcel(excelFilename);
	}
}

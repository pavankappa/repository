package week5.day12;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ProjectSpecificMetods {
	ChromeDriver driver;
	@BeforeMethod
	@Test
	@Parameters({"url","username","password"})
	public void launch(String url,String uname,String pwd) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElementById("username").sendKeys(uname);
	driver.findElementById("password").sendKeys(pwd);
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Leads").click();
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	@DataProvider()
	public String[][] getData() throws IOException {
		/*String[][] data = new String[2][3];
		
		data[0][0] = "TestLeaf" ;
		data[0][1] = "Sam";
		data[0][2] = "Lazarus";
		
		data[1][0] = "TestLeaf";
		data[1][1] = "Koshik";
		data[1][2] = "Chatterjee";
		*/
		ReadExcel get = new ReadExcel();
		return get.readExcel();
	}
}

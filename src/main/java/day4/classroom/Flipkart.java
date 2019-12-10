package day4.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	//driver.findElementByXPath("//button[text()='']").click();
	
	WebElement elect = driver.findElementByXPath("//span[text()='Electronics']");
	Actions builder = new Actions(driver);
	builder.moveToElement(elect);
}
}
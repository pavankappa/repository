package week2.assingments;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.redbus.in/");
		
		WebElement sl = driver.findElement(By.id("src"));
		sl.sendKeys("Chennai");
		Thread.sleep(3000);
		//sl.sendKeys(Keys.TAB);
		// Writing XPath to auto fill data
		sl.findElement(By.xpath("//li[text()='Chennai (All Locations)']")).click();
		
		WebElement dl = driver.findElement(By.id("dest"));
		dl.sendKeys("tirchy");
		Thread.sleep(3000);
		dl.sendKeys(Keys.TAB);
		
		Thread.sleep(3000);
		//WebElement sdate =driver.findElement(By.xpath("//input[@id='onward_cal']"));
		//sdate.sendKeys("10-Dec-2019");
		
		//rb-monthTable first last
		
		
		

	}

}

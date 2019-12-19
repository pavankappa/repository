package ZoomCar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WonderfulJourneyLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Launch URL: https://www.zoomcar.com/chennai
		driver.get("https://www.zoomcar.com/chennai");
		
		// Click on the Start your wonderful journey link
		driver.findElement(By.linkText("Start your wonderful journey")).click();
		
		// In the Search page, Click on any pick up point under POPULAR PICK-UP
		driver.findElement(By.xpath("(//div[@class='items'])[1]")).click();
		
		// Click on the Next button
		driver.findElement(By.xpath("//button[@class='proceed']")).click();
		
		//Specify the Start Date as tomorrow Date
		Date date = new Date(); // Get the current date
		DateFormat sdf = new SimpleDateFormat("dd"); //Get only the date (and not month, year, time etc)
		String today = sdf.format(date); // Get today's date
		int tomorrow = Integer.parseInt(today)+1; // Convert to integer and add 1 to it
		//System.out.println(tomorrow); // Print tomorrow's date
		
		Thread.sleep(2000);
		String nextday = Integer.toString(tomorrow) ;
		System.out.println(nextday);
		
		//System.out.println(driver.findElementByXPath("//div[contains(text(),'" +nextday+"')]").getText());
		driver.findElementByXPath("//div[contains(text(),'" +nextday+"')]").click();
		Thread.sleep(5000);
		
		// Click on the Next Button
		driver.findElementByXPath("//button[@class='proceed']").click();
		
		// Confirm the Start Date and Click on the Done button
		driver.findElementByXPath("//button[@class='proceed']").click();
		Thread.sleep(5000);
		
		// In the result page, capture the number of results displayed.
		List<WebElement> carPrices = driver.findElementsByXPath("//div[@class='price']");
		System.out.println(carPrices.size());
		
		List<WebElement> carNames = driver.findElementsByXPath("//h3");
		System.out.println(carNames.size());
		for (WebElement webElement : carNames) {
			System.out.println(webElement.getText());
		}
		
		
		
		/* List<WebElement> lstdays = driver.findElements(By.xpath("//div[@class='day']"));
		
		System.out.println(lstdays.size());
		
		
		for (WebElement eachChar : lstdays) {
			String day = eachChar.getText();
			if(day.contains(" 16")) {
				System.out.println(day);
			}
			else {
				System.out.println("Value not matched");
			}
		*/	
			
		}
		
		
		

	}


package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//open URL
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		//Switching to Frame
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[.='Try it']").click();
		
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Pavan");
		
		//alert.accept();
		alert.dismiss();
		WebElement locateText = driver.findElementByXPath("//p[@id='demo']");
		String text = locateText.getText();
		System.out.println(text);
		
		if(text.contains("Pavan")) {
			System.out.println("Name Verifed");
		}
		else {
			System.out.println("Not Verified");
		}

	}

}

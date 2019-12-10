package day4.classroom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {
	public static void main(String[] Args) {
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/selectable.html");
		WebElement item1= driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
		
		Actions builder = new Actions(driver);
		
		builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).keyUp(Keys.CONTROL).perform();
		
	}

}

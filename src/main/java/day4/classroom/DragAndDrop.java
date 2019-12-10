package day4.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] Args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://www.leafground.com/pages/drag.html");
		
		WebElement drag = driver.findElementById("draggable");
		Actions build = new Actions(driver);
		build.dragAndDropBy(drag, 100, 50).perform();
	}
}

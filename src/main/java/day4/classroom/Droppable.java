package day4.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {
	public static void main(String[] Args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		
		WebElement drag = driver.findElementById("draggable");
		WebElement drop = driver.findElementById("droppable");
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(drag, drop);
		
	}
}

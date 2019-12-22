package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Window {

@Test
	public static void mainiSW() {
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//open URL
		driver.get("http:leafground.com/pages/Window.html");
		
		//Click on "Open Multiple Windows"
		driver.findElementByXPath("//button[.='Open Multiple Windows']").click();
		
		// Print the count of opened windows/tabs
		Set<String> windowHandles = driver.getWindowHandles();
		// Set doesn't have get method, So we taking List 
		List<String> lstWindowHandles = new ArrayList<String>(windowHandles);
		int size = lstWindowHandles.size();
		System.out.println("The Count of opened windows is "+size);
		
		//Move Control to last window and Print title
		driver.switchTo().window(lstWindowHandles.get(size-1));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();	

	}

}

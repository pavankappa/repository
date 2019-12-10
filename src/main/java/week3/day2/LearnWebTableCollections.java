package week3.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTableCollections {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		
		driver.manage().window().maximize();
		
		WebElement eleSource = driver.findElementById("txtStationFrom");
		eleSource.clear();
		eleSource.sendKeys("MAS",Keys.TAB);
		
		WebElement eleDes = driver.findElementById("txtStationTo");
		eleDes.clear();
		eleDes.sendKeys("SBC",Keys.TAB);
		
		driver.findElementById("chkSelectDateOnly").click();
		Thread.sleep(5000);
		
		//WebElement eleTable = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		
		
		
		/*List<WebElement> row = eleTable.findElements(By.tagName("tr"));
		for (int i = 0; i < row.size(); i++) {
			List<WebElement> coldata = row.get(i).findElements(By.tagName("td"));
			System.out.println(coldata.get(1).getText());*/
		
		List<WebElement>  trainNames= driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[2]");
		for (WebElement tCol : trainNames) {
			System.out.println(tCol.getText());
			
		}
		
		//List <String> tName= new ArrayList<>();
		
		
		
		
			
		}
	}


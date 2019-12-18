package amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 7 pro mobiles",Keys.ENTER);
		String mobilePrice = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("Price of the first resulting mobile is "+mobilePrice);
		
		// Click on the Mobile (First resulting) image
		driver.findElement(By.xpath("//img[@class='s-image']")).click();
		
		//Switch to the new window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lstWindow = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(lstWindow.get(1));
		
		// Print the number of customer ratings
		String nReview = driver.findElement(By.id("acrCustomerReviewText")).getText();
		System.out.println(nReview);
		
		//Click 'Add to Cart'
		driver.findElement(By.id("add-to-cart-button")).click();
		
		//Confirm "Added to Cart" text message appeared
		String cartConfirm = driver.findElement(By.xpath("//h1[@class='a-size-medium a-text-bold']")).getText();
		//System.out.println(cartConfirm);
		
		if(cartConfirm.equals("Added to Cart"))
		{
			System.out.println("Item added");
		}
		else {
			System.out.println("cart item failed");
		}
		
		// Click to Proceed to Buy
		driver.findElement(By.id("hlb-ptc-btn-native")).click();
		
		//Confirm the title is "Amazon Sign In"
		String title = driver.getTitle();
		if(title.equals("Amazon Sign In"))
		{
			System.out.println("Page Title verified");
		}else {
			System.out.println("not verified");
		}
	
		// Click Continue (without entering mobile number / email)
		driver.findElement(By.id("continue")).click();
		
		// Verify the error message: Enter your email or mobile phone number
		String errorMessage = driver.findElement(By.xpath("(//div[@class='a-alert-content'])[2]")).getText();
		System.out.println("Error is "+errorMessage);
		
		driver.quit();
		
		
		


	}
}

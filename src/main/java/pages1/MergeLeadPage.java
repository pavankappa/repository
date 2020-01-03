package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import base.ProjectSpecificMethods;

public class MergeLeadPage extends ProjectSpecificMethods {
	public MergeLeadPage clickMergeButton() {
		driver.findElementByXPath("//*[text()='Merge']").click();
		return this;
	}
	public MergeLeadFindLeadPage clickFromLeadImageButton() throws InterruptedException {
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[1])[9]").click();
		Thread.sleep(2000);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lstWin = new ArrayList<String>(windowHandles);
		int noOfOpenWindows = lstWin.size();
		String secnWindow = lstWin.get(noOfOpenWindows - 1);
		String parentWindow = lstWin.get(0);
		driver.switchTo().window(secnWindow);
		String title = driver.getTitle();
		driver.manage().window().maximize();
		return new MergeLeadFindLeadPage();
	}

		public MergeLeadFindLeadPage clickToLeadImageButton() throws InterruptedException {
		driver.findElementByXPath("//*[@id=\"ComboBox_partyIdTo\"]").click();
		driver.findElementByXPath("(//img[1])[10]").click();
		Thread.sleep(2000);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lstWin = new ArrayList<String>(windowHandles);
		int noOfOpenWindows = lstWin.size();
		String secnWindow = lstWin.get(noOfOpenWindows - 1);
		String parentWindow = lstWin.get(0);
		driver.switchTo().window(secnWindow);
		String title = driver.getTitle();
		driver.manage().window().maximize();
		return new MergeLeadFindLeadPage();
	}

		/*
		 * public MergeLeadPage clickMergeLeadPageToLeadTextBox() throws
		 * InterruptedException { driver.switchTo().parentFrame();
		 * driver.findElementByXPath("//*[@id=\"ComboBox_partyIdTo\"]").click();
		 * Thread.sleep(2000); return this; }
		 */



}

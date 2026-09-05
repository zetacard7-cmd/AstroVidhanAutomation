package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.AlertPages;
import pages.BrowseerWindowsPage;

public class TestAlertPages extends BaseLibrary{
	
	@BeforeTest
	public void launchURl() throws InterruptedException {
		
		launchUrl();
	}
	
	@Test(priority=1)
	public void testClickOnClose() {
		
		AlertPages ap = new AlertPages();
		ap.clickOnClose();
	}
	
	@Test(priority=2)
	public void testClickOnPractice() {
		
		AlertPages ap = new AlertPages();
		ap.clickOnPractice();
	}
	
	@Test(priority=3)
		public void testClickOnAlertFrameAndWindows() {
		
		AlertPages ap = new AlertPages();
		ap.clickOnAlertFrameAndWindows();
		
	}
	
	@Test(priority=4)
	public void testClickOnAlert(){
		
		AlertPages ap = new AlertPages();
		ap.clickOnAlert();
	}
	
	@Test(priority=5)
	public void testClickOnSeeAlertButton() {
		
		AlertPages ap = new AlertPages();
		ap.clickOnSeeAlertButton();
	}
	
	@Test(priority=6)
	public void testClickOnAppearAfterButton() {
		
		AlertPages ap = new AlertPages();
		ap.clickOnAppearAfterButton();
	}
	
	@Test(priority=7)
	public void testClickOnConfirmBox() {
		
		AlertPages ap = new AlertPages();
		ap.clickOnConfirmBox();
	}
	
	@Test(priority=8)
	public void testClickOnPromptBox() {
		
		AlertPages ap = new AlertPages();
		ap.clickOnPromptBox();;
	}

}

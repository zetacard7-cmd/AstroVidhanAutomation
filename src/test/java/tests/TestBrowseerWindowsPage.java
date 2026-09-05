package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.BrowseerWindowsPage;

public class TestBrowseerWindowsPage extends BaseLibrary{
	
	@BeforeTest
	public void launchURl() throws InterruptedException {
		
		launchUrl();
	}
	
	@Test(priority=1)
	public void testClickOnClose() {
		
		BrowseerWindowsPage bp = new BrowseerWindowsPage();
		bp.clickOnClose();
	}
	
	@Test(priority=2)
	public void testClickOnPractice() {
		
		BrowseerWindowsPage bp = new BrowseerWindowsPage();
		bp.clickOnPractice();
	}
	
	@Test(priority=3)
		public void testClickOnAlertFrameAndWindows() {
		
		BrowseerWindowsPage bp = new BrowseerWindowsPage();
		bp.clickOnAlertFrameAndWindows();
		
	}
	
	@Test(priority=4)
	public void testClickOnBrowserWindows() {
		
		BrowseerWindowsPage bp = new BrowseerWindowsPage();
		bp.clickOnBrowserWindows();
	}
	
	@Test(priority=5)
	public void testClickOnNewTab() {
		
		BrowseerWindowsPage bp = new BrowseerWindowsPage();
		bp.clickOnNewTab();
	}

}

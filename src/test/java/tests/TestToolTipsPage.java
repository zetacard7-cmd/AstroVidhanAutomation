package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.MenuPage;
import pages.ToolTipsPage;

public class TestToolTipsPage extends BaseLibrary{
	
	@BeforeTest
	public void launchURl() throws InterruptedException {
		
		launchUrl();
	}
	
	@Test(priority=1)
	public void testClickOnClose() {
		
		ToolTipsPage ttp = new ToolTipsPage();
		ttp.clickOnClose();
	}
	
	@Test(priority=2)
	public void testClickOnPractice() {
		
		ToolTipsPage ttp = new ToolTipsPage();
		ttp.clickOnPractice();
	}
	
	
	@Test(priority=3)
	public void testClickOnWidget() {
		
		ToolTipsPage ttp = new ToolTipsPage();
		ttp.clickOnWidgets();
	}
	
	@Test(priority=4)
	public void testClickOnToolTips() {
		
		ToolTipsPage ttp = new ToolTipsPage();
		ttp.clickOnToolTips();
	}
	
	@Test(priority=5)
	public void testHoverOnHoverMeToSee() {
		
		ToolTipsPage ttp = new ToolTipsPage();
		ttp.hoverOnHoverMeToSee();
	}


}

package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.NestedFramePage;

public class TestNestedFramePage extends BaseLibrary{
	
	@BeforeTest
	public void launchURl() throws InterruptedException {
		
		launchUrl();
	}
	
	@Test(priority=1)
	public void testClickOnClose() {
		
		NestedFramePage nfp = new NestedFramePage();
		nfp.clickOnClose();
	}
	
	@Test(priority=2)
	public void testClickOnPractice() {
		
		NestedFramePage nfp = new NestedFramePage();
		nfp.clickOnPractice();
	}
	
	@Test(priority=3)
		public void testClickOnAlertFrameAndWindows() {
		
		NestedFramePage nfp = new NestedFramePage();
		nfp.clickOnAlertFrameAndWindows();
		
	}
	
	@Test(priority=4)
	public void testClickOnNestedFrame() {
		
		NestedFramePage nfp = new NestedFramePage();
		nfp.clickOnNestedFrame();
		
	}
	
	@Test(priority=5)
	public void testClickOnClickMe() {
		
		NestedFramePage nfp = new NestedFramePage();
		nfp.clickOnClickMe();
	}

}

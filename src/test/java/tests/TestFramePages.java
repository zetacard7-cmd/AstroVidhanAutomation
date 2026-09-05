package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.FramePages;

public class TestFramePages extends BaseLibrary{
	
	@BeforeTest
	public void launchURl() throws InterruptedException {
		
		launchUrl();
	}
	
	@Test(priority=1)
	public void testClickOnClose() {
		
		FramePages fp = new FramePages();
		fp.clickOnClose();
	}
	
	@Test(priority=2)
	public void testClickOnPractice() {
		
		FramePages fp = new FramePages();
		fp.clickOnPractice();
	}
	
	@Test(priority=3)
		public void testClickOnAlertFrameAndWindows() {
		
		FramePages fp = new FramePages();
		fp.clickOnAlertFrameAndWindows();
		
	}
	
	@Test(priority=4)
	public void testClickOnFrame() {
		
		FramePages fp = new FramePages();
		fp.clickOnFrame();
	}
	
	@Test(priority=5)
	public void testClickOnIFrame() {
		
		FramePages fp = new FramePages();
		fp.clickOnIFrame();
	}
	
	@Test(priority=6)
	public void testClickOnSmallIFrame() {
		
		FramePages fp = new FramePages();
		fp.clickOnSmallIFrame();
	}
	

}

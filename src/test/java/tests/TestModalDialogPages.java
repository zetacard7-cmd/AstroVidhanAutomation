package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.ModalDialogPages;

public class TestModalDialogPages extends BaseLibrary{
	
	@BeforeTest
	public void launchURl() throws InterruptedException {
		
		launchUrl();
	}
	
	@Test(priority=1)
	public void testClickOnClose() {
		
		ModalDialogPages mp = new ModalDialogPages();
		mp.clickOnClose();
	}
	
	@Test(priority=2)
	public void testClickOnPractice() {
		
		ModalDialogPages mp = new ModalDialogPages();
		mp.clickOnPractice();
	}
	
	@Test(priority=3)
		public void testClickOnAlertFrameAndWindows() {
		
		ModalDialogPages mp = new ModalDialogPages();
		mp.clickOnAlertFrameAndWindows();
	}
	
	@Test(priority=4)
	public void testClickOnModalDialogs() {
		
		ModalDialogPages mp = new ModalDialogPages();
		mp.clickOnModalDialogs();
	}
	
	@Test(priority=5)
	public void testClickOnSmallModal() {
		
		ModalDialogPages mp = new ModalDialogPages();
		mp.clickOnSmallModal();
	}
	
	
		
	
	

}

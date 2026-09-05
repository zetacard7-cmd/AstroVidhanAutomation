package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.LoginPage;
import pages.TextBoxPage;

public class LoginTest extends BaseLibrary {
	
	@BeforeTest
	public void launchURL() throws InterruptedException {
		
		launchUrl();
	}
	
	@Test
	public void testClickOnClose() {
		
		LoginPage ob = new LoginPage();
		ob.clickOnClose();
	}
	
	@Test
	public void getTitle() {
		LoginPage ob = new LoginPage();
		ob.title();
	}
	
}

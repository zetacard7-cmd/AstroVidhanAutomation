package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.RadioButtonPage;

public class TestRadioButtonPage extends BaseLibrary{
	
	@BeforeTest
	public void LaunchURL() throws InterruptedException {
		
		launchUrl();
	}
	
	@Test(priority=1)
	public void clickOnClose() {
		
		RadioButtonPage ob = new RadioButtonPage();
		ob.clickOnClose();
	}
	
	@Test(priority=2)
	public void clickOnPractice() throws InterruptedException {
		
		RadioButtonPage ob = new RadioButtonPage();
		ob.clickOnPractice();
	}
	@Test(priority=3)
	public void clickOnElement() throws InterruptedException {
		
		RadioButtonPage ob = new RadioButtonPage();
		ob.clickOnElement();
	}
	@Test(priority=4)
	public void testclickOnRadioButtons() {
		RadioButtonPage ob = new RadioButtonPage();
		ob.clickOnRadioButtons();
	}
	
	@Test(priority=4)
	public void testclickOnYes() {
		RadioButtonPage ob = new RadioButtonPage();
		ob.clickOnYes();
	}
}

package tests;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.CheckBoxPage;

public class TestCheckBox extends BaseLibrary{
	
	@BeforeTest
	public void LaunchURL() throws InterruptedException {
		
		launchUrl();
	}
	
	@Test(priority=1)
	public void clickOnClose() {
		
		CheckBoxPage ob = new CheckBoxPage();
		ob.clickOnClose();
	}
	
	@Test(priority=2)
	public void clickOnPractice() throws InterruptedException {
		
		CheckBoxPage ob = new CheckBoxPage();
		ob.clickOnPractice();
	}
	@Test(priority=3)
	public void clickOnElement() throws InterruptedException {
		
		CheckBoxPage ob = new CheckBoxPage();
		ob.clickOnElement();
	}
	
	@Test(priority=4)
	public void clickOnCheckBox() {
		
		CheckBoxPage ob = new CheckBoxPage();
		ob.clickOnCheckBox();
	}
	@Test(priority=5)
	public void testclickOnMobile() {
		
		CheckBoxPage ob = new CheckBoxPage();
		ob.clickOnMobile();
	}
	
	@Test(priority=6)
	public void testClickOnLaptop() {
		
		CheckBoxPage ob = new CheckBoxPage();
		ob.clickOnLaptop();
	}
	
	@Test(priority=7)
	public void testClickOnDesktop() {
		
		CheckBoxPage ob = new CheckBoxPage();
		ob.clickOnDesktop();
	}

}

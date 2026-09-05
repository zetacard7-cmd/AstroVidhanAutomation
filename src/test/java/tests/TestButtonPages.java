package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.ButtonPages;

public class TestButtonPages extends BaseLibrary{
	
	@BeforeTest
	public void LaunchURL() throws InterruptedException {
		
		launchUrl();
	}
	
	@Test(priority=1)
	public void clickOnClose() {
		
		ButtonPages ob = new ButtonPages();
		ob.clickOnClose();
	}
	
	@Test(priority=2)
	public void clickOnPractice() throws InterruptedException {
		
		ButtonPages ob = new ButtonPages();
		ob.clickOnPractice();
	}
	@Test(priority=3)
	public void clickOnElement() throws InterruptedException {
		
		ButtonPages ob = new ButtonPages();
		ob.clickOnElement();
	}
	
	@Test(priority=4)
	public void clickOnButtons() throws InterruptedException {
		
		ButtonPages ob = new ButtonPages();
		ob.clickOnButtons();
	}
	
	@Test(priority=5)
	public void testclickOnDoubleClick() {
		ButtonPages ob = new ButtonPages();
		ob.clickOnDoubleClick();	
	}
	
	@Test(priority=6)
	public void testclickOnRightClick() {
		ButtonPages ob = new ButtonPages();
		ob.clickOnRightClick();	
	}
	
	@Test(priority=7)
	public void testclickOnNormalClick() {
		ButtonPages ob = new ButtonPages();
		ob.clickOnNormalClick();
	}
	
	
																
		
	
}

package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.TextBoxPage;

public class TestTextBox extends BaseLibrary{
	
	@BeforeTest
	public void launchURL() throws InterruptedException {
		
		launchUrl();
	}
	
	@Test(priority=1)
	public void testClickOnClose() {
		
		TextBoxPage ob = new TextBoxPage();
		ob.clickOnClose();
	}
																
	@Test(priority=2)
	public void testclickOnPractice() throws InterruptedException {
		
		TextBoxPage ob = new TextBoxPage();
		ob.clickOnPractice();
	}
	
	@Test(priority=3)
	public void testclickOnElement() {
		
		TextBoxPage ob = new TextBoxPage();
		ob.clickOnElement();
	}
	
	@Test(priority=4)
	public void testclickOnTextBox() {
		TextBoxPage ob = new TextBoxPage();
		ob.clickOnTextBox();
	}
	
	@Test(priority=5)
	public void testfillDetails() {
		TextBoxPage ob = new TextBoxPage();
		ob.fillDetails();
	}
	
	@Test(priority=6)
	public void testValidate() {
		TextBoxPage ob = new TextBoxPage();
		ob.validate();

	}

}

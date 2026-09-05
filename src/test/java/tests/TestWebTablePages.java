package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baseLibrary.BaseLibrary;
import pages.WebTablesPages;

public class TestWebTablePages extends BaseLibrary{
	
	@BeforeTest
	public void LaunchURL() throws InterruptedException {
		
		launchUrl();
	}
	
	@Test(priority=1)
	public void clickOnClose() {
		
		WebTablesPages ob = new WebTablesPages();
		ob.clickOnClose();
	}
	
	@Test(priority=2)
	public void clickOnPractice() throws InterruptedException {
		
		WebTablesPages ob = new WebTablesPages();
		ob.clickOnPractice();
	}
	@Test(priority=3)
	public void clickOnElement() throws InterruptedException {
		
		WebTablesPages ob = new WebTablesPages();
		ob.clickOnElement();
	}
	@Test(priority=4)
	public void testclickOnWebTables() {
		WebTablesPages ob = new WebTablesPages();
		ob.clickOnWebTables();
		
	}
	@Test(priority=5)
	public void testfillDetails() {
		WebTablesPages ob = new WebTablesPages();
		ob.fillDetails();
	}
	@Test(priority=6)
	public void testUpdate() {
		WebTablesPages ob = new WebTablesPages();
		ob.update();
	}
	
	


}

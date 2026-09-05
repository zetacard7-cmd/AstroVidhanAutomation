package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baseLibrary.BaseLibrary;
import pages.LinksPage;

public class TestLinksPage extends BaseLibrary{
	
	@BeforeTest
	public void launchURL() throws InterruptedException {
		
		launchUrl();
	}
	
	@Test(priority=1)
	public void testClickOnClose() {
		
		LinksPage lp = new LinksPage();
		lp.clickOnClose();
	}
	
	@Test(priority=2)
	public void testClickOnPractice() {
		
		LinksPage lp = new LinksPage();
		lp.clickOnPractice();
	}
	
	@Test(priority=3)
	public void testClickOnElements() {
		
		LinksPage lp = new LinksPage();
		lp.clickOnElements();
	}
	
	@Test(priority=4)
	public void testClickOnLinks() {
		
		LinksPage lp = new LinksPage();
		lp.clickOnLinks();
	}
	
	@Test(priority=5)
	public void testClickOnDemoPage() {
		
		LinksPage lp = new LinksPage();
		lp.clickOnDemoPage();
	}
	
	@Test(priority=6)
	public void testClickOnCloseNewTab() {
		LinksPage lp = new LinksPage();
		lp.clickOnCloseNewTab();
	}
	
	@Test(priority=7)
	public void testClickOnCreated() {
		LinksPage lp = new LinksPage();
		lp.clickOnCreated();
	}

}

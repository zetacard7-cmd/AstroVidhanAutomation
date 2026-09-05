package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.MenuPage;
import pages.SelectMenuPage;

public class TestMenuPage extends BaseLibrary{
	
	@BeforeTest
	public void launchURl() throws InterruptedException {
		
		launchUrl();
	}
	
	@Test(priority=1)
	public void testClickOnClose() {
		
		MenuPage mp = new MenuPage();
		mp.clickOnClose();
	}
	
	@Test(priority=2)
	public void testClickOnPractice() {
		
		MenuPage mp = new MenuPage();
		mp.clickOnPractice();
	}
	
	
	@Test(priority=3)
	public void testClickOnWidget() {
		
		MenuPage mp = new MenuPage();
		mp.clickOnWidgets();
	}

	@Test(priority=5)
	public void testClickOnSelect() {
		
		MenuPage mp = new MenuPage();
		mp.clickOnSelect();;
	}

	@Test(priority=6)
	public void testClickOnBlog() {
		
		MenuPage mp = new MenuPage();
		mp.hoverOnBlog();
	}
	
	@Test(priority=7)
	public void testHoverOnJavaScript() {
		
		MenuPage mp = new MenuPage();
		mp.hoverOnJavaScript();
		
	}

}

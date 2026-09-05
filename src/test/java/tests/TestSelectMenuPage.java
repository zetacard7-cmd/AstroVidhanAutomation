package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.FramePages;
import pages.SelectMenuPage;

public class TestSelectMenuPage extends BaseLibrary{
	
	@BeforeTest
	public void launchURl() throws InterruptedException {
		
		launchUrl();
	}
	
	@Test(priority=1)
	public void testClickOnClose() {
		
		SelectMenuPage smp = new SelectMenuPage();
		smp.clickOnClose();
	}
	
	@Test(priority=2)
	public void testClickOnPractice() {
		
		SelectMenuPage smp = new SelectMenuPage();
		smp.clickOnPractice();
	}
	
	
	@Test(priority=3)
	public void testClickOnWidget() {
		
		SelectMenuPage smp = new SelectMenuPage();
		smp.clickOnWidgets();
	}
	
	@Test(priority=4)
	public void testClickOnSelectMenu() {
		
		SelectMenuPage smp = new SelectMenuPage();
		smp.clickOnSelectMenu();	
	}
	
	@Test(priority=5)
	public void clickOnSelectMenuOption1() {
		
		SelectMenuPage smp = new SelectMenuPage();
		smp.clickOnSelectMenuOption1();
	}
	
	@Test(priority=5)
	public void clickOnSelectMenuOption2() {
		
		SelectMenuPage smp = new SelectMenuPage();
		smp.clickOnSelectMenuOption2();
	}
	
	@Test(priority=6)
	public void testClickOnselectOneOption() {
		
		SelectMenuPage smp = new SelectMenuPage();
		smp.clickOnselectOneOption();
	}
	
	@Test(priority=7)
	public void testClickOnOldStyleSelectMenu() {
		
		SelectMenuPage smp = new SelectMenuPage();
		smp.clickOnOldStyleSelectMenu();
	}
	
	@Test(priority=8)
	public void testClickOnStandardMultiText() {
		
		SelectMenuPage smp = new SelectMenuPage();
		smp.clickOnStandardMultiText();
		
	}
}

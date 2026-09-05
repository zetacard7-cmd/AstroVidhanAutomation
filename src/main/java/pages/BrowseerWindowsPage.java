package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class BrowseerWindowsPage extends BaseLibrary{
	
	public BrowseerWindowsPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void launchURL() throws InterruptedException {
		
		launchUrl();
	}
	
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target=\"#alerts\"]")
	private WebElement alertFrameAndWindows;
	
	@FindBy(xpath="//a[@href=\"#tab_11\"]")
	private WebElement browser;
	
	@FindBy(xpath="//a[@href=\"https://www.google.co.in/\"]")
	private WebElement newTab;
	
	@FindBy(xpath = "//textarea[@name='q']")
	private WebElement searchinput;
	
	@FindBy(xpath="//input[@aria-label=\"Google Search\" and @data-ved=\"0ahUKEwjiyc6926mUAxXRfGwGHZM-O1gQ4dUDCCM\"]")
	private WebElement submit;
	
	@FindBy(xpath="//a[@onclick=\"win1open()\"]")
	private WebElement newWindow;
	
	public void clickOnClose() {
		
		waitForClick(close);
	}
	
	public void clickOnPractice() {
		
		waitForClick(practice);
	}
	
	public void clickOnAlertFrameAndWindows() {
		
		waitForClick(alertFrameAndWindows);
	}
	
	public void clickOnBrowserWindows() {
		
		waitForClick(browser);
	}
	
	public void clickOnNewTab() {

	    newTab.click();
	    switchToNewTab(1);
	    waitforSendKeys(searchinput, getReadData("Input"));
		try {
			Robot rob = new Robot();
			rob.delay(1000);
			rob.keyPress(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
	    switchToNewTab(0);

	
	}
	
	public void clickOnNewWindow() {
		
	}
	
	

}

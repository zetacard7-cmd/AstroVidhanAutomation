package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class ModalDialogPages extends BaseLibrary{
	
	public ModalDialogPages() {
		
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
	
	@FindBy(xpath="//a[@href=\"#tab_15\"]")
	private WebElement modalDialogs;
	
	@FindBy(xpath="//button[@data-target=\"#exampleModal1\"]")
	private WebElement smallModal;
	
	@FindBy(xpath="//div[contains(text(),'This is a small modal. It has very less content')]")
	private WebElement smallModalText;
	
public void clickOnClose() {
		
		waitForClick(close);
	}
	
	public void clickOnPractice() {
		
		waitForClick(practice);
	}
	
	public void clickOnAlertFrameAndWindows() {
		
		waitForClick(alertFrameAndWindows);
	}
	
	public void clickOnModalDialogs() {
		
		waitForClick(modalDialogs);
	}
	
	public void clickOnSmallModal() {
		
		waitForClick(smallModal);
		String txt = smallModalText.getText();
		System.out.println(txt);
	}

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class ButtonPages extends BaseLibrary{
	
	public ButtonPages() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy (xpath="//button[text()='×']")
	private WebElement close;
		
	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@class=\"btn btn-block p-0 text-left\"]")
	private WebElement element;
	
	@FindBy(xpath="//a[@href=\"#tab_5\"]")
	private WebElement buttons;
	
	@FindBy(xpath="//button[@ondblclick=\"doubletext()\"]")
	private WebElement doubleClick;
	
	@FindBy(xpath="//button[@oncontextmenu=\"righttext()\"]")
	private WebElement rightClick;
	
	@FindBy(xpath="//button[@onclick=\"clicktext()\"]")
	private WebElement normalClick;
	
	public void clickOnClose() {
		waitForClick(close);
	}
	
	public void clickOnPractice() throws InterruptedException {
		waitForClick(practice);
		//Thread.sleep(2000);
	}
	
	public void clickOnElement() throws InterruptedException {
		waitForClick(element);
		//Thread.sleep(2000);
	}
	
	public void clickOnButtons() {
		waitForClick(buttons);

	}
	
	public void clickOnDoubleClick() {
		doubleClickOnElement(doubleClick);
	}
	
	public void clickOnRightClick() {	
		rightClickOnElement(rightClick);
	}
	
	public void clickOnNormalClick() {
		waitForClick(normalClick);
	}

}

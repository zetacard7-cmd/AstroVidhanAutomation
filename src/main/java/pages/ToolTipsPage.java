package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class ToolTipsPage extends BaseLibrary{
	
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target=\"#widget\"]")
	private WebElement widgets;
	
	@FindBy(xpath="//a[@href=\"#tab_22\"]")
	private WebElement toolTips;
	
	@FindBy(xpath="//button[@data-toggle=\"tooltip\"]")
	private WebElement hoverMeToSee;
	
	public ToolTipsPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnClose() {
		
		waitForClick(close);
	}
	
	public void clickOnPractice() {
		
		waitForClick(practice);
	}

	public void clickOnWidgets() {
		
		waitForClick(widgets);
	}
	
	public void clickOnToolTips() {
		
		waitForClick(toolTips);
	}
	
	public void hoverOnHoverMeToSee() {
		
		normalClickOnElement(hoverMeToSee);
		String title = hoverMeToSee.getAttribute("title");
		System.out.println(title);
	}

}

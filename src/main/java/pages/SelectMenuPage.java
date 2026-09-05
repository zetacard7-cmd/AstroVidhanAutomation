package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class SelectMenuPage extends BaseLibrary{
	
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target=\"#widget\"]")
	private WebElement widgets;
	
	@FindBy(xpath="//a[@href=\"#tab_24\"]")
	private WebElement selectMenu;
	
	@FindBy(xpath="//label[text()='Select Value']//following-sibling::select")
	private WebElement selectValueOption; 
	
	@FindBy(xpath="//label[text()='Select Value']//following-sibling::select")
	private WebElement selectValueOption2; 
	
	@FindBy(xpath="//label[text()='Select One']//following-sibling::select")
	private WebElement selectOneOption;
	
	@FindBy(xpath="//label[text()='OLd Styel Select Menu']//following-sibling::div/select")
	private WebElement oldStyleSelectMenu;
	
	@FindBy(xpath="//label[text()='Standard Multi Select']//following-sibling::div/select")
	private WebElement standardMultiText;
	
	
	public SelectMenuPage() {
		
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
	
	public void clickOnSelectMenu() {
		
		waitForClick(selectMenu);
	}
	
	public void clickOnSelectMenuOption1() {
		
		selectByText(selectValueOption,"Group 1, Option 2");
	}
	
	public void clickOnSelectMenuOption2() {
		
		selectByIndex(selectValueOption,4);
	}
	
	public void clickOnselectOneOption() {
		
		selectByIndex(selectOneOption,1);
	}
	
	public void clickOnOldStyleSelectMenu() {
		
		selectByIndex(oldStyleSelectMenu,3);
	}

	public void clickOnStandardMultiText() {
		
		selectByIndex(standardMultiText,2);
	}
}

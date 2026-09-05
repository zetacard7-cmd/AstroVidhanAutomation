package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseLibrary.BaseLibrary;

public class NestedFramePage extends BaseLibrary{
	
	public NestedFramePage() {
		
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
	
	@FindBy(xpath="//a[@href=\"#tab_14\"]")
	private WebElement nestedFrame;
	
	@FindBy(xpath="//iframe[@src=\"target1.html\"]")
	private WebElement pageIFrame;
	
	@FindBy(xpath="//iframe[@src=\"text.html\"]")
	private WebElement parentIFrame;
	
	@FindBy(xpath="//iframe[@src=\"example.html\"]")
	private WebElement childIFrame;
	
	@FindBy(xpath="//a[@href=\"text1.html\"]")
	private WebElement clickMe; 
	
	@FindBy(xpath="//p[text()='Hello']")
	private WebElement clickMeText;
	
	public void clickOnClose() {
		
		waitForClick(close);
	}
	
	public void clickOnPractice() {
		
		waitForClick(practice);
	}
	
	public void clickOnAlertFrameAndWindows() {
		
		waitForClick(alertFrameAndWindows);
	}
	
	public void clickOnNestedFrame() {
		
		waitForClick(nestedFrame);
	}
	
	public void clickOnClickMe() {
		
		driver.switchTo().frame(pageIFrame);
		driver.switchTo().frame(parentIFrame);
		driver.switchTo().frame(childIFrame);
		clickMe.click();
		String actual = clickMeText.getText();
		driver.switchTo().defaultContent();
		driver.switchTo().defaultContent();
		driver.switchTo().defaultContent();
		System.out.println(actual);
		String expected = getReadData("TextForNestedPage");
		System.out.println(expected);
		Assert.assertEquals(actual, expected);



	}
	

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseLibrary.BaseLibrary;

public class FramePages extends BaseLibrary{
	
	public FramePages() {
		
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
	
	@FindBy(xpath="//a[@href=\"#tab_13\"]")
	private WebElement frame;
	
	@FindBy(xpath="//iframe[@style=\"height:200px;width:400px\"]")
	private WebElement iFrame;
	
	@FindBy(xpath="//h1[text()='This is a sample page']")
	private WebElement bigIFrameText;
	
	@FindBy(xpath="//iframe[@style=\"height:80px;width:120px\"]")
	private WebElement smallIFrame;
	
	@FindBy(xpath="//h1[text()='This is a sample page']")
	private WebElement smalIIFrameText;
	
	public void clickOnClose() {
		
		waitForClick(close);
	}
	
	public void clickOnPractice() {
		
		waitForClick(practice);
	}
	
	public void clickOnAlertFrameAndWindows() {
		
		waitForClick(alertFrameAndWindows);
	}
	
	public void clickOnFrame() {
		
		waitForClick(frame);
	}
	
	public void clickOnIFrame() {
		
		driver.switchTo().frame(iFrame);
		String actual = bigIFrameText.getText();
		System.out.println(actual);
		driver.switchTo().defaultContent();
		String expected = getReadData("BigIframe");
		System.out.println(expected);
		Assert.assertEquals(actual,expected);
		
	}
	
	public void clickOnSmallIFrame() {
		
		driver.switchTo().frame(smallIFrame);
		String actual = smalIIFrameText.getText();
		System.out.println(actual);
		driver.switchTo().defaultContent();
		String expected = getReadData("SmallFrame");
		System.out.println(expected);
		Assert.assertEquals(actual,expected);
		
	}

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import baseLibrary.BaseLibrary;

public class LinksPage extends BaseLibrary{
	
	public LinksPage() {
		
		PageFactory.initElements(driver,this);
	}
	
	public void launchURL() throws InterruptedException {
		
		launchUrl();
	}
	
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@class=\"btn btn-block p-0 text-left\"]")
	private WebElement elements;
	
	@FindBy(xpath="//a[@href=\"#tab_6\"]")
	private WebElement links;
	
	@FindBy(xpath="//a[text()='Demo Page']")
	private WebElement demoPage;
	
	@FindBy(xpath="//a[@onclick=\"Created()\"]")
	private WebElement created;
	
	@FindBy(xpath="//p[@id=\"link-result\"]")
	private WebElement createdText;
	
	public void clickOnClose() {
		
		waitForClick(close);
	}
	
	public void clickOnPractice() {
		
		waitForClick(practice);
	}
	
	public void clickOnElements() {
		
		waitForClick(elements);
	}
	
	public void clickOnLinks() {
		
		waitForClick(links);
	}
	
	public void clickOnDemoPage() {
		
		waitForClick(demoPage);
	}
	
	public void clickOnCloseNewTab() {
		
		switchToNewTab(1);
		waitForClick(close);
		switchToNewTab(0);

	}
	
	public void clickOnCreated() {
		
		waitForClick(created);
		String actual = createdText.getText();
		String expected = getReadData("Created");	
		System.out.println(actual);
		System.out.println(expected);
		
		Assert.assertEquals(actual,expected);

	}

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseLibrary.BaseLibrary;

public class AlertPages extends BaseLibrary{
	
	public AlertPages() {
		
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
	
	@FindBy(xpath="//a[@href=\"#tab_12\"]")
	private WebElement alert;
	
	@FindBy(xpath="//button[@onclick=\"myalert()\"]")
	private WebElement seeAlertButton;
	
	@FindBy(xpath="//button[@onclick=\"aftersec5()\"]")
	private WebElement appearAfter;
	
	@FindBy(xpath="//button[@onclick=\"myconfirm()\"]")
	private WebElement confirmBox;
	
	@FindBy(xpath="//button[@onclick=\"myprompt()\"]")
	private WebElement promptBox;
	
	@FindBy(xpath="//span[@id=\"confirm-result\"]")
	private WebElement promptBoxText;
	
	@FindBy(xpath="//span[@id=\"name-result\"]")
	private WebElement confirmBoxText;
	
	public void clickOnClose() {
		
		waitForClick(close);
	}
	
	public void clickOnPractice() {
		
		waitForClick(practice);
	}
	
	public void clickOnAlertFrameAndWindows() {
		
		waitForClick(alertFrameAndWindows);
	}
	
	public void clickOnAlert() {
		
		waitForClick(alert);
	}
	
	public void clickOnSeeAlertButton() {
			
		seeAlertButton.click();
		//driver.switchTo().alert().accept();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
	}
	
	public void clickOnAppearAfterButton() {
		
		waitForClick(appearAfter);
		waitForAlert();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
	}
	
	public void clickOnConfirmBox() {
		
		confirmBox.click();
		driver.switchTo().alert().dismiss();
		String actual = promptBoxText.getText();
		System.out.println(actual);
		String expected = getReadData("PromptBox");
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
	}
	
	public void  clickOnPromptBox() {
		
		promptBox.click();
		driver.switchTo().alert().sendKeys("Hello Guys");
		driver.switchTo().alert().accept();
		String actual = confirmBoxText.getText();
		System.out.println(actual);
		String expected = getReadData("ConfirmBox");
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
	}


}

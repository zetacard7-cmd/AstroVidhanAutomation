package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class RadioButtonPage extends BaseLibrary{
	
	public RadioButtonPage() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy (xpath="//button[text()='×']")
	private WebElement close;
		
	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@class=\"btn btn-block p-0 text-left\"]")
	private WebElement element;
	
	@FindBy(xpath="//a[@href=\"#tab_3\"]")
	private WebElement radioButtons;
	
	@FindBy(xpath="//input[@id=\"yes\"]")
	private WebElement yes;
	
	@FindBy(xpath="//p[text()='You have selected yes']")
	private WebElement yesText;
	
	public void clickOnClose() {
		close.click();
	}
	
	public void clickOnPractice() throws InterruptedException {
		practice.click();
		Thread.sleep(2000);
	}
	
	public void clickOnElement() throws InterruptedException {
		element.click();
		Thread.sleep(2000);
	}
	
	public void clickOnRadioButtons() {
		
		radioButtons.click();
	}
	
	public void clickOnYes() {
		yes.click();
		String actual = yesText.getText();
		String expected = getReadData("yes");
		System.out.println(actual);
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
	}
	
	

}

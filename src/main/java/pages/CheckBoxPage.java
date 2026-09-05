package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseLibrary.BaseLibrary;

public class CheckBoxPage extends BaseLibrary{
	
	public CheckBoxPage() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy (xpath="//button[text()='×']")
	private WebElement close;
		
	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@class=\"btn btn-block p-0 text-left\"]")
	private WebElement element;
	
	@FindBy(xpath="//a[text()='check box']")
	private WebElement checkbox;
	
	@FindBy(xpath="//iframe[@src=\"Checkbox.html\"]")
	private WebElement iFrame;
	
	@FindBy(xpath="//input[@id=\"myCheck\"]")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@id=\"mylaptop\"]")
	private WebElement laptop;
	
	@FindBy(xpath="//input[@id=\"mydesktop\"]")
	private WebElement desktop;
	
	@FindBy(xpath="//h6[@id=\"text\"]")
	private WebElement mobiletext;
	
	@FindBy(xpath="//h6[@id=\"text1\"]")
	private WebElement laptoptext;
	
	@FindBy(xpath="//h6[@id=\"text2\"]")
	private WebElement desktoptext;
	
	
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
	
	public void clickOnCheckBox() {
		checkbox.click();
		
	}
	
	public void clickOnMobile() {
		driver.switchTo().frame(iFrame);
		mobile.click();
		String actual = mobiletext.getText();
		String expected = getReadData("mobile");
		System.out.println(actual);
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
	}
	
	public void clickOnLaptop() {
		laptop.click();
		String actual = laptoptext.getText();
		String expected = getReadData("Laptop");
		System.out.println(actual);
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
	}
	
	public void clickOnDesktop() {
		desktop.click();
		String actual = desktoptext.getText();
		String expected = getReadData("Desktop");
		System.out.println(actual);
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		driver.switchTo().defaultContent();
	}

}

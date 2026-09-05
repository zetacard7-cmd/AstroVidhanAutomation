package pages;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseLibrary.BaseLibrary;

public class TextBoxPage extends BaseLibrary{
	
	public TextBoxPage() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy (xpath="//button[text()='×']")
	private WebElement close;
		
	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@class=\"btn btn-block p-0 text-left\"]")
	private WebElement element;
	
	@FindBy(xpath="//a[@href=\"#tab_1\"]")
	private WebElement textBox;
	
	@FindBy(xpath="//input[@id=\"fullname1\"]")
	private WebElement fullName;

	@FindBy(xpath="//input[@id=\"fullemail1\"]")
	private WebElement email;
	
	@FindBy(xpath="//textarea[@id=\"fulladdresh1\"]")
	private WebElement caddress;
	
	@FindBy(xpath="//textarea[@id=\"paddresh1\"]")
	private WebElement paddress;
	
	@FindBy(xpath="//input[@value=\"Submit\"]")
	private WebElement submit;
	
	@FindBy(xpath="//div[@class=\"col-md-6 mt-5\"]/label")
	private List<WebElement> list;
	
	public void clickOnClose() {
		close.click();
	}
	
	public void clickOnPractice() throws InterruptedException {
		practice.click();
		Thread.sleep(2000);
	}
	
	public void clickOnElement() {
		element.click();
	}
	
	public void clickOnTextBox() {
		textBox.click();
	}
	
	public void fillDetails() {
		
		fullName.sendKeys(getReadData(0,1,0));
		   email.sendKeys(getReadData(0,1,1));
		caddress.sendKeys(getReadData(0,1,2));
		paddress.sendKeys(getReadData(0,1,3));
		submit.click();
	}
	
	public void validate() {
		
		
		ArrayList<String> expected = new ArrayList<>();
		ArrayList<String> actual = new ArrayList<>();
		
		for(int i = 0 ; i < 4 ; i++) {
			expected.add(getReadData(0,1,i));
		}
		
		for(int i = 1 ; i < list.size() ; i = i + 2) {
			actual.add(list.get(i).getText());
		}
		
		for(int i = 0 ; i < expected.size() ; i++) {
			Assert.assertEquals(expected.get(i), actual.get(i));
		}
			System.out.println("validation done");
		System.out.println(expected);
		System.out.println(actual);

		
	}
}

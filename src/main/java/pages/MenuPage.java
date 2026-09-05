package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class MenuPage extends BaseLibrary{
	
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target=\"#widget\"]")
	private WebElement widgets;
	
	@FindBy(xpath="//a[@href=\"#tab_23\"]")
	private WebElement select;
	
	@FindBy(xpath="//nav[@id=\"navbar\"]/ul/li[4]")
	private WebElement blog;
	
	@FindBy(xpath="//nav[@id=\"navbar\"]/ul/li[4]/ul/li[3]/a")
	private WebElement javaScript;
	
	public MenuPage() {
		
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
	
	public void clickOnSelect() {
		
		waitForClick(select);
	}
	
	public void hoverOnBlog() {
		
		normalClickOnElement(blog);
	}
	
	
	public void hoverOnJavaScript() {
		
		normalClickOnElement(javaScript);
		String value = javaScript.getText();
		System.out.println(value);
	}
}

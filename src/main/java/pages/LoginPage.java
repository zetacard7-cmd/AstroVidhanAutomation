package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;



public class LoginPage extends BaseLibrary{
		
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath="//button[text()='×']")
	private WebElement close;
	
	
	public void clickOnClose() {
		close.click();
	}
	
	public void title() {
		String title = driver.getTitle();
		System.out.println(title);
	}

}

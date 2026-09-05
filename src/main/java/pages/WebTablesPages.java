package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class WebTablesPages extends BaseLibrary{
	
	public WebTablesPages() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy (xpath="//button[text()='×']")
	private WebElement close;
		
	@FindBy(xpath="//a[@href=\"newdemo.html\"]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@class=\"btn btn-block p-0 text-left\"]")
	private WebElement element;
	
	@FindBy(xpath="//a[@href=\"#tab_4\"]")
	private WebElement webtables;
	
	@FindBy(xpath="//iframe[@src=\"Webtable.html\"]")
	private WebElement iFrame;
	
	@FindBy(xpath="//input[@pattern=\"^[a-zA-Z][\\sa-zA-Z]{2,32}\"]")
	private WebElement tableName;
	
	@FindBy(xpath="//input[@name=\"email\"]")
	private WebElement tableEmail;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement save;
	
	@FindBy(xpath="//button[@class=\"btn btn-info btn-xs btn-edit\"]")
	private List<WebElement> edit;
	
	@FindBy(xpath="//input[@name=\"edit_name\"]")
	private WebElement editName;
	
	@FindBy(xpath="//input[@name=\"edit_email\"]")
	private WebElement editEmail;
	
	@FindBy(xpath="//button[text()='Update']")
	private WebElement update;

	
	public void clickOnClose() {
		waitForClick(close);
	}
	
	public void clickOnPractice() throws InterruptedException {
		waitForClick(practice);
		//Thread.sleep(2000);
	}
	
	public void clickOnElement() throws InterruptedException {
		waitForClick(element);
		//Thread.sleep(2000);
	}
	
	public void clickOnWebTables() {
		waitForClick(webtables);
	}
	
	public void fillDetails() {
		
		driver.switchTo().frame(iFrame);
		for(int i = 1 ; i < 5 ; i++) {
			
			waitforSendKeys(tableName,getReadData(1,i,0));
			//tableName.sendKeys(getReadData(1,i,0));
			waitforSendKeys(tableEmail,getReadData(1,i,1));
			//tableEmail.sendKeys(getReadData(1,i,1));
			//save.click();
			waitForClick(save);

		}
	}
	
	public void update() {

		for(int i = 0 ; i < edit.size() ; i++) {
			
			edit.get(i).click();
			editName.clear();
			editName.sendKeys(getReadData(1,i+1,0));
			editEmail.clear();
			editEmail.sendKeys(getReadData(1,i+1,1));
			update.click();
		}
		driver.switchTo().defaultContent();

	}

}

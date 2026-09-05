package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class UploadAndDownloadPage extends BaseLibrary{
	
	String path = "D:\\WorkSpace\\6thMayAutomation\\testData\\config.properties";
public UploadAndDownloadPage() {
		
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
	
	@FindBy(xpath="//a[@href=\"#tab_8\"]")
	private WebElement uploadAndDownload;
	
	@FindBy(xpath="//label[@for=\"File1\"]")
	private WebElement chooseFile;
	
public void clickOnClose() {
		
		waitForClick(close);
	}
	
	public void clickOnPractice() {
		
		waitForClick(practice);
	}
	
	public void clickOnElements() {
		
		waitForClick(elements);
	}
	
	public void clickOnUploadAndDownload() {
		
		waitForClick(uploadAndDownload);
	}
	
	public void clickOnChooseFile() {
		
		waitForClick(chooseFile);
	}
	
	public void uploadFile() {
		
		uploadFile(path);
	}


}

package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.LinksPage;
import pages.UploadAndDownloadPage;

public class TestUploadAndDownloadPage extends BaseLibrary{
	
	@BeforeTest
	public void launchURL() throws InterruptedException {
		
		launchUrl();
	}
	
	@Test(priority=1)
	public void testClickOnClose() {
		
		UploadAndDownloadPage ud = new UploadAndDownloadPage();
		ud.clickOnClose();
	}
	
	@Test(priority=2)
	public void testClickOnPractice() {
		
		UploadAndDownloadPage ud = new UploadAndDownloadPage();
		ud.clickOnPractice();
	}
	
	@Test(priority=3)
	public void testClickOnElements() {
		
		UploadAndDownloadPage ud = new UploadAndDownloadPage();
		ud.clickOnElements();
	}
	
	@Test(priority=4)
	public void testClickOnUploadAndDownload() {
		
		UploadAndDownloadPage ud = new UploadAndDownloadPage();
		ud.clickOnUploadAndDownload();
	}
	
	@Test(priority=5)
	public void testClickOnChooseFile() {
		
		UploadAndDownloadPage ud = new UploadAndDownloadPage();
		ud.clickOnChooseFile();
	}
	
	@Test(priority=6)
	public void testUploadFile(){
		
		UploadAndDownloadPage ud = new UploadAndDownloadPage();
		ud.uploadFile();
	}

}

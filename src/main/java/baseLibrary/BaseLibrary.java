package baseLibrary;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import applicationUtility.ApplicationUtility;
import excelUtility.excelUtility;
import propertyUtility.PropertyUtility;
import screenShotUtility.ScreenShotUtility;
import waitUtility.WaitUtility;

public class BaseLibrary implements excelUtility, PropertyUtility, WaitUtility, ApplicationUtility, ScreenShotUtility{
	
		public static WebDriver driver = null;
	
	public void launchUrl() throws InterruptedException {
		
		String path = "D:\\WorkSpace\\6thMayAutomation\\Web Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		 driver = new ChromeDriver();
		 driver.get("https://www.astrovidhan.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 ChromeOptions cp = new ChromeOptions();
		 cp.setAcceptInsecureCerts(true);

	}

	@Override
	public String getReadData(int sheetNo, int rowNo, int colNo) {
		String path = "D:\\WorkSpace\\6thMayAutomation\\testData\\excelSheet.xlsx";
		String value = " ";
		
		try {
				FileInputStream fis = new FileInputStream(path);
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				XSSFSheet sheet = wb.getSheetAt(sheetNo);
				value = sheet.getRow(rowNo).getCell(colNo).getStringCellValue();
			
		}catch (Exception e) {
			
			System.out.println("Issue in get read data: "+e);
		}
		return value;
	}

	@Override
	public String getReadData(String key) {
			String path = "D:\\WorkSpace\\6thMayAutomation\\testData\\config.properties";
			String value = "";
			try {
			FileInputStream fis = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);
		} catch(Exception e) {
			System.out.println("Get the data: "+e);
		}
			
			return value;
	}

	@Override
	public void waitForClick(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
	}

	@Override
	public void waitforSendKeys(WebElement ele, String text) {
		WebDriverWait wait = new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys(text);
		
	}

	@Override
	public void waitForAlert() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.alertIsPresent());
				
	}

	@Override
	public void doubleClickOnElement(WebElement ele) {

		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
	}

	@Override
	public void rightClickOnElement(WebElement ele) {
		
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();		
	}

	@Override
	public void normalClickOnElement(WebElement ele) {
		
		Actions act = new Actions(driver);
		//act.click(ele).perform();
		act.moveToElement(ele).build().perform();
		//act.dragAndDrop(ele, ele);
	}

	@Override
	public void switchToNewTab(int index) {
		Set<String> set = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<>(set);
		driver.switchTo().window(list.get(index));
		
	}

	@Override
	public void uploadFile(String filePath) {
		
		try {
			
			StringSelection sel = new StringSelection(filePath);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(sel, null);
			
			Robot rob = new Robot();
			
			rob.keyPress(KeyEvent.VK_CONTROL);
			rob.delay(1000);
			rob.keyPress(KeyEvent.VK_V);
			rob.delay(1000);
			
			rob.keyRelease(KeyEvent.VK_V);
			rob.delay(1000);
			rob.keyRelease(KeyEvent.VK_CONTROL);
			rob.delay(1000);
			
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.delay(1000);
			rob.keyRelease(KeyEvent.VK_ENTER);
			rob.delay(1000);
			
		} catch(Exception e) {
			System.out.println("Issue in upload file: "+e);
		}
	}

	@Override
	public void getScreenShot(String folderName, String fileName) {
		
		String loc = System.getProperty("user.dir");
		String path = loc + "//screenshot//"+ folderName + "//" + fileName + ".png";
		
		try {
			
			EventFiringWebDriver efw = new EventFiringWebDriver(driver);
			File source = efw.getScreenshotAs(OutputType.FILE);
			File destination = new File(path);
			FileUtils.copyFile(source, destination);
			
		}catch(Exception e) {
			
			System.out.println("Issue in Screenshot: "+e);
		}
	}	
		
		@AfterMethod
		public void resultAnalysis(ITestResult result) {
			
			String methodName = result.getMethod().getMethodName();
			if(result.getStatus()==ITestResult.SUCCESS) {
				
				getScreenShot("pass",methodName);
			}
			else if(result.getStatus()==ITestResult.FAILURE) {
				
				getScreenShot("fail",methodName);
			}
		}

		@Override
		public void selectByText(WebElement ele, String text) {

			Select sel = new Select(ele);
			sel.selectByVisibleText(text);
			
		}

		@Override
		public void selectByIndex(WebElement ele, int index) {

			Select sel = new Select(ele);
			sel.selectByIndex(index);
		}

		@Override
		public void Value(WebElement ele, String value) {
			
			Select sel = new Select(ele);
			sel.selectByValue(value);
		}
		
}

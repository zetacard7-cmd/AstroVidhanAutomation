package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.astrovidhan.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='×']")).click();
		driver.findElement(By.xpath("//a[@href=\"newdemo.html\"]")).click();
		driver.findElement(By.xpath("//button[@data-target=\"#elements\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"#tab_1\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"fullname1\"]")).sendKeys(getReadData(0,1,0));
		driver.findElement(By.xpath("//input[@id=\"fullemail1\"]")).sendKeys(getReadData(0,1,1));
		driver.findElement(By.xpath("//textarea[@id=\"fulladdresh1\"]")).sendKeys(getReadData(0,1,2));
		driver.findElement(By.xpath("//textarea[@id=\"paddresh1\"]")).sendKeys(getReadData(0,1,3));
		driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"col-md-6 mt-5\"]/label"));
		
		for(int i = 1 ; i < list.size() ; i=i+2) {
			System.out.println(list.get(i).getText());
		}
		ArrayList<String> list2 = new ArrayList<>();
		
		for(int i = 0 ; i < 4 ; i++) {
			list2.add(getReadData(0,1,i));
		}
		System.out.println(list2);	
	}

	public static String getReadData(int sheetNo,int rowNo,int colNo ) throws FileNotFoundException {
		
		String path = "D:\\WorkSpace\\6thMayAutomation\\src\\Book1.xlsx";
		String value = "";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(sheetNo);
			value = sheet.getRow(rowNo).getCell(colNo).getStringCellValue();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		
	}
}

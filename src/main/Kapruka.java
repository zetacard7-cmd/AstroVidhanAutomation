package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kapruka {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kapruka.com/");
		driver.findElement(By.xpath("//div[@id=\"cart\"]")).click();
	}

}

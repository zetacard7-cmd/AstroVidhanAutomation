package test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\"b3wTlE\"]")).click();
		WebElement search = driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]"));
		search.sendKeys("car");
		Thread.sleep(2000);
		search.sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	}

}

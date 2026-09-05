package applicationUtility;

import org.openqa.selenium.WebElement;

public interface ApplicationUtility {
	
	public void doubleClickOnElement(WebElement ele);
	public void rightClickOnElement(WebElement ele);
	public void normalClickOnElement(WebElement ele);
	public void switchToNewTab(int index);
	public void uploadFile (String filePath);
	public void selectByText(WebElement ele, String text);
	public void selectByIndex(WebElement ele, int index);
	public void Value(WebElement ele, String value);


}

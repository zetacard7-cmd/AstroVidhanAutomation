package waitUtility;

import org.openqa.selenium.WebElement;

public interface WaitUtility {
	
	public void waitForClick(WebElement ele);
	public void waitforSendKeys(WebElement ele,String text);
	public void waitForAlert();

}

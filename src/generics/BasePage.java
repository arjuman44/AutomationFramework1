package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	public void selectByVisibleText (WebElement element, String text)
	{
		Select scl = new Select(element);
		scl.selectByVisibleText(text);
	}
	
	public void selectByIndex(WebElement element, int index)
	{
		Select scl = new Select(element);
		scl.selectByIndex(index);
	}
	
	public void selectByValue(WebElement element, String text)
	{
		Select scl = new Select(element);
		scl.selectByValue(text);
	}
	
	public void actionsContextClick(WebDriver driver, WebElement element)
	{
	
	Actions act = new Actions(driver);
	act.contextClick(element).perform();
}
}

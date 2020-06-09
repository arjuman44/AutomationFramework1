package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstants;
import generics.ExcelLibrary;

public class pomFbLoginPage implements AutoConstants  //Also extends basePage to use any other reusable classes like actions like select class
{
	@FindBy(id="email")
	private WebElement emailTextField;
	
	@FindBy(id="pass")
	private WebElement passwordTextFieled;
	
	@FindBy(id="u_0_b")
	private WebElement logInButton;
	
	public pomFbLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public void loginMethod() throws IOException
	{
		emailTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, sheetname, 1, 0));
		passwordTextFieled.sendKeys(ExcelLibrary.getCellValue(excel_path, sheetname, 1, 1));
		logInButton.click();
	}
}

package test.pages;

import org.openqa.selenium.By;

import test.utils.Constants;

public class FB_LoginPage {
	

	public static By _txtUsername = By.xpath("//input[@type='email']");
	public static By _txtPassword = By.xpath("//td/input[@type='password']");
	public static By _btnLogin = By.xpath("//input[@type='submit']");
	
	public static By _txtUsernameNew = By.xpath("//input[@id='email']");
	public static By _txtPasswordNew = By.xpath("//input[@id='pass']");
	public static By _btnLoginNew = By.xpath("//button[@name='login']");

	public static HomePage login(String username, String password) {
		
		if((Constants.DRIVER.findElements(_txtUsername).size() == 1)==true)
		{
		Constants.DRIVER.findElement(_txtUsername).sendKeys(username);
		Constants.DRIVER.findElement(_txtPassword).sendKeys(password);
		Constants.DRIVER.findElement(_btnLogin).click();
		}
		else loginNew(username,password);
		
		return new HomePage();
	}
	
	public static HomePage loginNew(String username, String password) {
		
		Constants.DRIVER.findElement(_txtUsernameNew).sendKeys(username);
		Constants.DRIVER.findElement(_txtPasswordNew).sendKeys(password);
		Constants.DRIVER.findElement(_btnLoginNew).click();
		return new HomePage();
	}
	
}

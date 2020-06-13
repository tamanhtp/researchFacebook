package test.pages;

import org.openqa.selenium.By;

import test.utils.Constants;

public class FB_LoginPage {
	

	public static By _txtUsername = By.xpath("//input[@type='email']");
	public static By _txtPassword = By.xpath("//td/input[@type='password']");
	public static By _btnLogin = By.xpath("//input[@type='submit']");

	public static HomePage login(String username, String password) {
		Constants.DRIVER.findElement(_txtUsername).sendKeys(username);
		Constants.DRIVER.findElement(_txtPassword).sendKeys(password);
		Constants.DRIVER.findElement(_btnLogin).click();
		return new HomePage();
	}
}

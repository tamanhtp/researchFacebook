package test.pages;

import org.openqa.selenium.By;

import test.utils.Constants;

public class LoginPage {

	public static By _txtUsername = By.id("mod-login-username");
	public static By _txtPassword = By.id("mod-login-password");
	public static By _btnLogin = By.xpath("//button");

	public static HomePage login(String username, String password) {
		Constants.DRIVER.findElement(_txtUsername).sendKeys(username);
		Constants.DRIVER.findElement(_txtPassword).sendKeys(password);
		Constants.DRIVER.findElement(_btnLogin).click();
		return new HomePage();
	}
}

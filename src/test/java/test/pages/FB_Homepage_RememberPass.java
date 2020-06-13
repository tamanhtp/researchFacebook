package test.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import test.utils.Constants;

public class FB_Homepage_RememberPass {
	

	public static By _btnCancelRememberPass= By.xpath("//td[2]/a[@role='button']");
	public static By _btnOkRememberPass= By.xpath("//td[1]/a[@role='button']");
	
	public static HomePage Cancel() {
		
		Constants.DRIVER.findElement(_btnCancelRememberPass).click();
		return new HomePage();
	}
	public static HomePage Ok() {
		Constants.DRIVER.findElement(_btnOkRememberPass).click();
		return new HomePage();
	}
}

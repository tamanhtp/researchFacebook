package test.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import test.utils.Constants;

public class FB_PostStatus {
	

	public static By _txtContentInput = By.xpath("//textarea");
	public static By _buttonPrivate = By.xpath("//div[contains(@class,'composerAudienceWrapper')]");
	public static By _buttonPrivateOther = By.xpath("//li[5]/a[@role='menuitemcheckbox']");
	public static By _buttonOnlyMe = By.xpath("//li[7]/a[@role='menuitemcheckbox']");
	public static By _buttonPost = By.xpath("//div[2]/button[@type='submit']");
	
	public static By _btnLogin = By.xpath("//input[@type='submit']");

	
	public static String statusContent = "This is status with Only me private";
	public static HomePage Post() {
		Constants.DRIVER.findElement(_txtContentInput).sendKeys(statusContent);
		
//		Constants.DRIVER.findElement(_buttonPrivate).click();
//		
//		if((Constants.DRIVER.findElements(_buttonPrivateOther).size() == 1)==true)
//		{
//		Constants.DRIVER.findElement(_buttonPrivateOther).click();
//		}
//		Constants.DRIVER.findElement(_buttonOnlyMe).click();
//
//		Constants.DRIVER.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Constants.DRIVER.findElement(_buttonPost).click();
		return new HomePage();
	}
}

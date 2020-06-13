package test.pages;

import org.openqa.selenium.By;

import test.utils.Constants;

public class BannersEditClientPage extends GeneralPage {
	private By _txtName = By.id("jform_name");
	private By _txtContact = By.id("jform_contact");
	private By _txtEmail = By.id("jform_email");
	private By _divMessage = By
			.xpath("//div[contains(@class,'alert-success')]//div[@class='alert-message']");
	private By _title = By
			.xpath("//h1//span[normalize-space(text()='Banners: Edit Client')]");

	public void updateNewClientForm(String name, String contactName,
			String contactEmail) {
		Constants.DRIVER.findElement(_txtName).clear();
		Constants.DRIVER.findElement(_txtName).sendKeys(name);
		Constants.DRIVER.findElement(_txtContact).clear();
		Constants.DRIVER.findElement(_txtContact).sendKeys(contactName);
		Constants.DRIVER.findElement(_txtEmail).clear();
		Constants.DRIVER.findElement(_txtEmail).sendKeys(contactEmail);
	}

	public String getMessageText() {
		return Constants.DRIVER.findElement(_divMessage).getText();
	}

	public boolean doesEditPageDisplays() {
		return Constants.DRIVER.findElements(_title).size() == 1;
	}
}

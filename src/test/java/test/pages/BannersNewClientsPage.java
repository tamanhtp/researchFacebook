package test.pages;

import org.openqa.selenium.By;

import test.utils.Constants;

public class BannersNewClientsPage extends GeneralPage {
	private By _txtName = By.id("jform_name");
	private By _txtContact = By.id("jform_contact");
	private By _txtEmail = By.id("jform_email");
	private By _linkStatus = By
			.xpath("//label[contains(text(),'Status')]/../..//b");
	String published = "//li[text()='%s']";
	private By _btnSave = By.id("toolbar-apply");
	private By _btnSaveAndClose = By.id("toolbar-save");

	public void fillNewClientForm(String name, String contactName,
			String contactEmail) {
		Constants.DRIVER.findElement(_txtName).sendKeys(name);
		Constants.DRIVER.findElement(_txtContact).sendKeys(contactName);
		Constants.DRIVER.findElement(_txtEmail).sendKeys(contactEmail);
	}

	public void fillNewClientForm(String name, String contactName,
			String contactEmail, String Status) {
		Constants.DRIVER.findElement(_txtName).sendKeys(name);
		Constants.DRIVER.findElement(_txtContact).sendKeys(contactName);
		Constants.DRIVER.findElement(_txtEmail).sendKeys(contactEmail);
		Constants.DRIVER.findElement(_linkStatus).click();
		Constants.DRIVER.findElement(
				By.xpath(String.format(published, Status))).click();
	}

	public void clickBtnSave() {
		Constants.DRIVER.findElement(_btnSave).click();
	}

	public void clickBtnSaveAndClose() {
		Constants.DRIVER.findElement(_btnSaveAndClose).click();
	}
}

package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.utils.Constants;

public class BannersClientsPage extends GeneralPage {
	private String _inputCheck = "//td//a[normalize-space(text())='%s']//ancestor::tr//input";
	private String _inputCheckAll = "//th//a[normalize-space(text())='Status']/ancestor::tr/th/input";
	private String _clientName = "//td//a[normalize-space(text())='%s']";
	private String _boxName = "//td//a[normalize-space(text())='%s']//ancestor::tr//span[@class='icon-%s']";
	private By _divMessage = By
			.xpath("//div[contains(@class,'alert-success')]//div[@class='alert-message']");
	private By _btnSearchTools = By
			.xpath("//button[normalize-space(text())='Search Tools']");
	private By _divStatus = By.xpath("//select[@id='filter_state']/../div");
	private String _liStatus = "//div[contains(@id,'filter_state')]//li[text()='%s']";
	private By _btnClear = By
			.xpath("//button[normalize-space(text())='Clear']");
	private By _btnNew = By.id("toolbar-new");
	private By _btnPublish = By.id("toolbar-publish");
	private By _btnTrash = By.id("toolbar-trash");
	private By _btnEmptyTrash = By.id("toolbar-delete");
	private By _divFilter = By.className("js-stools-field-filter");
	private By _divListLimit = By.xpath("//select[@id='list_limit']/..");
	private By _liAll = By.xpath("//ul//li[text()='All']");

	public void clickBtnNew() {
		Constants.DRIVER.findElement(_btnNew).click();
	}

	public void clickBtnPublish() {
		Constants.DRIVER.findElement(_btnPublish).click();
	}

	public void cleanData() {
		Constants.DRIVER.findElement(_divListLimit).click();
		Constants.DRIVER.findElement(_liAll).click();
		this.clickBtnClear();
		this.clickBtnSearchTools();
		this.selectStatus("All");
		if (Constants.DRIVER.findElements(By.xpath(_inputCheckAll)).size() == 1) {
			Constants.DRIVER.findElement(By.xpath(_inputCheckAll)).click();
			Constants.DRIVER.findElement(_btnTrash).click();
			this.clickBtnClear();
			this.clickBtnSearchTools();
			this.selectStatus("Trashed");
			Constants.DRIVER.findElement(By.xpath(_inputCheckAll)).click();
			Constants.DRIVER.findElement(_btnEmptyTrash).click();
			Constants.DRIVER.switchTo().alert().accept();
			WebDriverWait wait = new WebDriverWait(Constants.DRIVER, 3);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert-message")));
		}
	}

	public void selectCheckbox(String title) {
		if (Constants.DRIVER.findElements(
				By.xpath(String.format(_inputCheck, title))).size() == 1) {
			Constants.DRIVER.findElement(
					By.xpath(String.format(_inputCheck, title))).click();
		}
	}

	public void clickBtnSearchTools(){
		Constants.DRIVER.findElement(_btnSearchTools).click();
		WebDriverWait wait = new WebDriverWait(Constants.DRIVER, 60);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(_divFilter));
	}

	public void clickBtnClear() {
		Constants.DRIVER.findElement(_btnClear).click();
	}

	public void selectStatus(String status) {
		Constants.DRIVER.findElement(_divStatus).click();	
		Constants.DRIVER
				.findElement(By.xpath(String.format(_liStatus, status)))
				.click();
	}

	public String getMessageText() {
		return Constants.DRIVER.findElement(_divMessage).getText();
	}

	public boolean doesElelementExists(String title) {
		 return Constants.DRIVER.findElements(
				By.xpath(String.format(_clientName, title))).size() == 1;
	}

	public boolean doesElementStatus(String title, String status) {
		return Constants.DRIVER.findElements(
				By.xpath(String.format(_boxName, title, status))).size() == 1;

	}
}

package test.pages;

import org.openqa.selenium.By;

import test.utils.Constants;

public class WebLinksPage extends GeneralPage{

	GeneralPage generalPage = new GeneralPage();
	
	private By _menu_WebLinks = By.xpath("//ul[@id='submenu']//a[contains(text(),'Web Links')]");
	private By _divStatus_Weblinks = By.xpath("//select[@id='filter_published']/../div");
	private String _liStatus = "//div[contains(@id,'filter_published')]//li[text()='%s']";

	public void gotoWeblinks() {
		Constants.DRIVER.findElement(_menu_WebLinks).click();
	}

	public void selectStatus(String status){
		Constants.DRIVER.findElement(_divStatus_Weblinks).click();
		Constants.DRIVER.findElement(By.xpath(String.format(_liStatus, status))).click();
	}
	
	public void enterTitle(String title) {
		Constants.DRIVER.findElement(generalPage._txtTitle).clear();
		Constants.DRIVER.findElement(generalPage._txtTitle).sendKeys(title);
	}
	public void enterURL(String url) {
		Constants.DRIVER.findElement(generalPage._txtUrl).clear();
		Constants.DRIVER.findElement(generalPage._txtUrl).sendKeys(url);
	}
	public void goToWebLinksNewPage() {
		generalPage.clickBtnNew();
	}
	
}

package test.pages;

import org.openqa.selenium.By;

import test.utils.Constants;
import test.utils.Utilities;

public class WebLinksNewPage extends GeneralPage {
	
	GeneralPage generalPage = new GeneralPage(); 
	public void createNew(String title, String alias, String url,
			String content, By status) throws InterruptedException {
		Constants.DRIVER.findElement(generalPage._txtTitle).sendKeys(title);
		Constants.DRIVER.findElement(generalPage._txtAlias).sendKeys(alias);
		Constants.DRIVER.findElement(generalPage._txtUrl).sendKeys(url);
		Utilities.findElementInIframe(generalPage._txtarea_iframe,generalPage._txtarea_content, content);
		Constants.DRIVER.findElement(_dropdownlist_Status).click();
		Constants.DRIVER.findElement(status).click();
		
	}
}

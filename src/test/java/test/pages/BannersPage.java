package test.pages;

import org.openqa.selenium.By;

import test.utils.Constants;

public class BannersPage extends GeneralPage {
	private static By _linkBanners = By
			.xpath("//ul[@id='submenu']//a[contains(text(),'Banners')]");
	private static By _linkBannersCategories = By
			.xpath("//ul[@id='submenu']//a[contains(text(),'Categories')]");
	private static By _linkBannersClients = By
			.xpath("//ul[@id='submenu']//a[contains(text(),'Clients')]");
	private static By _linkBannersTracks = By
			.xpath("//ul[@id='submenu']//a[contains(text(),'Tracks')]");

	public void goToBanners() {
		Constants.DRIVER.findElement(_linkBanners).click();
	}

	public static void goToBannersCategories() {
		Constants.DRIVER.findElement(_linkBannersCategories).click();
	}

	public void goToBannersClientsPage() {
		Constants.DRIVER.findElement(_linkBannersClients).click();
	}

	public static void goToBannersTracks() {
		Constants.DRIVER.findElement(_linkBannersTracks).click();
	}
}

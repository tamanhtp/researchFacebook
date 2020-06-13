package test.pages;

public class HomePage extends GeneralPage {
	public BannersPage goToBannerPage() {
		this.clickComponents();
		this.clickBanner();
		return new BannersPage();
	}

	public WebLinksPage goToWebLinksPage() {
		this.clickComponents();
		this.clickWeblinks();
		return new WebLinksPage();
	}
}

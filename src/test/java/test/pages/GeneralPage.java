package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.utils.Constants;

public class GeneralPage {
	private By _btnSearchTools = By.xpath("//button[normalize-space(text())='Search Tools']");
	private By _divStatus = By.xpath("//select[@id='filter_published']/../div");
	private By _btnClear = By.xpath("//button[normalize-space(text())='Clear']");
	private String _liStatus = "//div[contains(@id,'filter_state')]//li[text()='%s']";
	private By _divFilter = By.className("js-stools-field-filter");
	private By _divListLimit = By.xpath("//select[@id='list_limit']/..");
	private By _liAll = By.xpath("//ul//li[text()='All']");

	private By _btnNew = By.id("toolbar-new");
	private By _btnEdit = By.id("toolbar-edit");
	private By _btnPublish = By.id("toolbar-publish");
	private By _btnUnpublish = By.id("toolbar-unpublish");
	private By _btnArchive = By.id("toolbar-archive");
	private By _btnCheckin = By.id("toolbar-checkin");
	private By _btnTrash = By.id("toolbar-trash");
	private By _btnBatch = By.id("toolbar-batch");
	private By _btnOptions = By.id("toolbar-options");
	private By _btnHelp = By.id("toolbar-help");
	private By _btnRefresh = By.id("toolbar-refresh");
	private By _btnSave = By.id("toolbar-apply");
	private By _btnSaveAndClose = By.id("toolbar-save");
	private By _btnSaveAndNew = By.id("toolbar-save-new");
	private By _btnCancel = By.id("toolbar-cancel");

	protected By _txtTitle = By.id("jform_title");
	protected By _txtAlias = By.id("jform_alias");
	protected By _txtUrl = By.id("jform_url");
	private By _txtFilterSearch = By.id("filter_search");
	private By _btnSearch = By.xpath("//span[@class='icon-search']");

	public By _dropdownlist_Status = By.xpath("//label[contains(text(),'Status')]/../..//b");

	// items in dropdownlist
	public By _status_Published = By.xpath("//li[text()='Published']");
	public By _status_Unpublished = By.xpath("//li[text()='Unpublished']");
	public By _status_Archived = By.xpath("//li[text()='Archived']");
	public By _status_Trashed = By.xpath("//li[text()='Trashed']");

	protected By _txtarea_iframe = By.id("jform_description_ifr");
	protected By _txtarea_content = By.xpath("//body[@id='tinymce']");

	// menu bar
	private By _menu_ControlPanel = By.xpath("//a[contains(@class,'admin-logo')]");
	private By _menu_System = By.xpath("//a[@class='dropdown-toggle' and contains(text(),'System')]");
	private By _menu_Users = By.xpath("//a[@class='dropdown-toggle' and contains(text(),'Users')]");
	private By _menu_Menus = By.xpath("//a[@class='dropdown-toggle' and contains(text(),'Menus')]");
	private By _menu_Content = By.xpath("//a[@class='dropdown-toggle' and contains(text(),'Content')]");
	private By _menu_Components = By.xpath("//a[@class='dropdown-toggle' and contains(text(),'Components')]");
	private By _menu_Extensions = By.xpath("//a[@class='dropdown-toggle' and contains(text(),'Extensions')]");
	private By _menu_Help = By.xpath("//a[@class='dropdown-toggle' and contains(text(),'Help')]");
	// left menu Control Panel
	private By _menu_NewArticle = By.xpath("//span[contains(text(),'New Article')]/..");
	private By _menu_Articles = By.xpath("//span[contains(text(),'Articles')]/..");
	private By _menu_Categories = By.xpath("//span[contains(text(),'Categories')]/..");
	private By _menu_Media = By.xpath("//span[contains(text(),'Media')]/..");
	private By _menu_Menu_s = By.xpath("//span[contains(text(),'Menu(s)')]/..");
	private By _menu_Modules = By.xpath("//span[contains(text(),'Modules')]/..");
	private By _menu_NoUrgentRequests = By.xpath("//span[contains(text(),'No Urgent Requests')]/..");
	private By _menu_Global = By.xpath("//span[contains(text(),'Global')]/..");
	private By _menu_Templates = By.xpath("//span[contains(text(),'Templates')]/..");
	private By _menu_Languages = By.xpath("//span[contains(text(),'Languages')]/..");
	private By _menu_IntallExtensions = By.xpath("//span[contains(text(),'Intall Extensions')]/..");
	// sub menu
	private By _linkWebLinks = By.xpath("//a[@class='dropdown-toggle menu-weblinks']");
	private By _linkBanners = By.xpath("//a[@class='dropdown-toggle menu-banners']");

	// alert message
	private By _mess_Saved = By.xpath("//div[@class='alert-message' and contains(text(),'saved')]");
	private By _mess_Published = By.xpath("//div[@class='alert-message' and contains(text(),'published')]");
	private By _mess_Trashed = By.xpath("//div[@class='alert-message' and contains(text(),'trashed')]");
	private By _mess_Archived = By.xpath("//div[@class='alert-message' and contains(text(),'archived')]");
	private By _mess_Checkedin = By.xpath("//div[@class='alert-message' and contains(text(),'checked in')]");
	private By _mess_Unpublished = By.xpath("//div[@class='alert-message' and contains(text(),'unpublished')]");
	// Logout
	private By _userMenu = By.xpath("//div[contains(text(),'User Menu')]");
	private By _logoutMenu = By.linkText("Logout");

	private String _iconPublish = "//a[normalize-space(text())='%s']/../..//span[@class='icon-publish']";
	private String _iconUnpublish = "//a[normalize-space(text())='%s']/../..//span[@class='icon-unpublish']";

	private String _inputCheckAll = "//th//a[normalize-space(text())='Status']/ancestor::tr/th/input";
	private By _btnEmptyTrash = By.id("toolbar-delete");

	public boolean doesIconPublishDisplayed(String title) {
		return Constants.DRIVER.findElement(By.xpath(String.format(_iconPublish, title))).isDisplayed();
	}

	public boolean doesIconUnpublishDisplayed(String title) {
		return Constants.DRIVER.findElement(By.xpath(String.format(_iconUnpublish, title))).isDisplayed();
	}

	public void click_button(By btn) {
		Constants.DRIVER.findElement(btn).click();
	}

	public void clickBtnNew() {
		Constants.DRIVER.findElement(_btnNew).click();
	}

	public void clickBtnEdit() {
		Constants.DRIVER.findElement(_btnEdit).click();
	}

	public void clickBtnPublish() {
		Constants.DRIVER.findElement(_btnPublish).click();
	}

	public void clickBtnUnpublish() {
		Constants.DRIVER.findElement(_btnUnpublish).click();
	}

	public void clickBtnArchive() {

		Constants.DRIVER.findElement(_btnArchive).click();
	}

	public void clickBtnCheckin() {
		Constants.DRIVER.findElement(_btnCheckin).click();
	}

	public void clickBtnTrash() {

		Constants.DRIVER.findElement(_btnTrash).click();
	}

	public void clickBtnBatch() {
		Constants.DRIVER.findElement(_btnBatch).click();
	}

	public void clickBtnOptions() {
		Constants.DRIVER.findElement(_btnOptions).click();
	}

	public void clickBtnHelp() {
		Constants.DRIVER.findElement(_btnHelp).click();
	}

	public void clickBtnRebuild() {
		Constants.DRIVER.findElement(_btnRefresh).click();
	}

	public void clickBtnSave() {
		Constants.DRIVER.findElement(_btnSave).click();
	}

	public void clickBtnSaveAndClose() {
		Constants.DRIVER.findElement(_btnSaveAndClose).click();
	}

	public void clickSaveAndNew() {
		Constants.DRIVER.findElement(_btnSaveAndNew).click();
	}

	public void clickBtnCancel() {
		Constants.DRIVER.findElement(_btnCancel).click();
	}

	public void gotoHome() {
		Constants.DRIVER.findElement(_menu_ControlPanel).click();
	}

	public void gotoSystem() {
		Constants.DRIVER.findElement(_menu_System).click();
	}

	public void clickUsers() {
		Constants.DRIVER.findElement(_menu_Users).click();
	}

	public void clickMenus() {
		Constants.DRIVER.findElement(_menu_Menus).click();
	}

	public void clickContent() {
		Constants.DRIVER.findElement(_menu_Content).click();
	}

	public void clickComponents() {
		Constants.DRIVER.findElement(_menu_Components).click();
	}

	public void clickExtensions() {
		Constants.DRIVER.findElement(_menu_Extensions).click();
	}

	public void clickHelp() {
		Constants.DRIVER.findElement(_menu_Help).click();
	}

	public void gotoNewArticle() {
		Constants.DRIVER.findElement(_menu_NewArticle).click();
	}

	public void gotoArticles() {
		Constants.DRIVER.findElement(_menu_Articles).click();
	}

	public void gotoCategories() {
		Constants.DRIVER.findElement(_menu_Categories).click();
	}

	public void gotoMedia() {
		Constants.DRIVER.findElement(_menu_Media).click();
	}

	public void gotoMenus_menubar() {
		Constants.DRIVER.findElement(_menu_Menu_s).click();
	}

	public void gotoModules() {
		Constants.DRIVER.findElement(_menu_Modules).click();
	}

	public void gotoUsers() {
		Constants.DRIVER.findElement(_menu_Users).click();
	}

	public void gotoNoUrgent() {
		Constants.DRIVER.findElement(_menu_NoUrgentRequests).click();
	}

	public void gotoGlobal() {
		Constants.DRIVER.findElement(_menu_Global).click();
	}

	public void gotoTemplates() {
		Constants.DRIVER.findElement(_menu_Templates).click();
	}

	public void gotoLanguage() {
		Constants.DRIVER.findElement(_menu_Languages).click();
	}

	public void gotoIntallExtensions() {
		Constants.DRIVER.findElement(_menu_IntallExtensions).click();
	}

	public void clickBanner() {
		Constants.DRIVER.findElement(_linkBanners).click();
	}

	public void clickWeblinks() {
		Constants.DRIVER.findElement(_linkWebLinks).click();
	}

	// check after create an entry with alert message
	public boolean checkSaved() {
		return Constants.DRIVER.findElement(_mess_Saved).isDisplayed();
	}

	public boolean checkPublished() {
		return Constants.DRIVER.findElement(_mess_Published).isDisplayed();
	}

	public boolean checkTrashed() {
		return Constants.DRIVER.findElement(_mess_Trashed).isDisplayed();
	}

	public boolean checkArchived() {
		return Constants.DRIVER.findElement(_mess_Archived).isDisplayed();
	}

	public boolean checkCheckedin() {
		return Constants.DRIVER.findElement(_mess_Checkedin).isDisplayed();
	}

	public boolean checkUnpublished() {
		return Constants.DRIVER.findElement(_mess_Unpublished).isDisplayed();
	}

	// check if an entry created
	public boolean checkCreationByTitle(String title) {
		Constants.DRIVER.findElement(_txtFilterSearch).clear();
		Constants.DRIVER.findElement(_txtFilterSearch).sendKeys(title);
		Constants.DRIVER.findElement(_btnSearch).click();

		String xpath = String.format("//table//a[contains(text(),'%s')]", title);
		return Constants.DRIVER.findElement(By.xpath(xpath)).isDisplayed();
	}

	public boolean checkCheckinIconbyTitle(String title) {
		String xpath = String.format("//a[normalize-space(text())='%s']/..//span[@class=\"icon-checkedout\"]", title);
		return Constants.DRIVER.findElements(By.xpath(xpath)).size() == 1;
	}

	public void clickAnEntryWithTitle(String title) {

		Constants.DRIVER.findElement(_txtFilterSearch).sendKeys(title);
		Constants.DRIVER.findElement(_btnSearch).click();
		String xpath = String.format("//table//a[contains(text(),'%s')]", title);
		Constants.DRIVER.findElement(By.xpath(xpath)).click();

	}

	public void selectCheckboxWithTitle(String title) {

		Constants.DRIVER.findElement(_txtFilterSearch).clear();
		Constants.DRIVER.findElement(_txtFilterSearch).sendKeys(title);
		Constants.DRIVER.findElement(_btnSearch).click();
		String xpath = String.format("//table//a[contains(text(),'%s')]/../..//input", title);
		if (!Constants.DRIVER.findElement(By.xpath(xpath)).isSelected()) {
			Constants.DRIVER.findElement(By.xpath(xpath)).click();
		}
	}

	public void waitForFilter(int seconds) {
		WebDriverWait wait = new WebDriverWait(Constants.DRIVER, seconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(_divFilter));
	}

	public void logout() {
		Constants.DRIVER.findElement(_userMenu).click();
		Constants.DRIVER.findElement(_logoutMenu).click();
	}

	public void clickBtnSearchTools() {
		Constants.DRIVER.findElement(_btnSearchTools).click();
		WebDriverWait wait = new WebDriverWait(Constants.DRIVER, 60);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(_divFilter));
	}

	public void clickBtnClear() {
		Constants.DRIVER.findElement(_btnClear).click();
	}

	public void selectStatus(String status) {
		Constants.DRIVER.findElement(_divStatus).click();
		Constants.DRIVER.findElement(By.xpath(String.format(_liStatus, status))).click();
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
}

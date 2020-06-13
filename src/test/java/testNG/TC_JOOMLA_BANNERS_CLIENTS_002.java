package testNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import test.pages.BannersClientsPage;
import test.pages.BannersEditClientPage;
import test.pages.BannersNewClientsPage;
import test.pages.BannersPage;
import test.pages.HomePage;
import test.pages.LoginPage;
import test.utils.Constants;
import test.utils.Log4j;
import test.utils.Utilities;

public class TC_JOOMLA_BANNERS_CLIENTS_002 extends TestHelper {
	HomePage homePage = new HomePage();
	BannersPage bannersPage = new BannersPage();
	BannersClientsPage bannersClientsPage = new BannersClientsPage();
	BannersNewClientsPage bannersNewClientsPage = new BannersNewClientsPage();
	BannersEditClientPage bannersEditClientPage = new BannersEditClientPage();
	String titleName = Utilities.getName();
	String titleName1 = Utilities.getName();

	@BeforeMethod
	public void beforeMethod() {
		Log4j.info("Step 1. Login");
		LoginPage.login(Constants.LOGIN_USERNAME, Constants.LOGIN_PASSWORD);

		Log4j.info("Step 2. Go to banner page ");
		homePage.goToBannerPage();

		Log4j.info("Step 3. Go to banner client page ");
		bannersPage.goToBannersClientsPage();

		Log4j.info("Step 4. Go to new client page");
		bannersClientsPage.clickBtnNew();
	}

	@Test(description = "TC_JOOMLA_BANNERS_CLIENTS_002-Verify that user can edit a client")
	public void f() {
		Log4j.info("Step 5. Fill new client form");
		bannersNewClientsPage.fillNewClientForm(titleName,
				Utilities.getContactName(), Utilities.getContactEmail());

		Log4j.info("Step 6. Click button save");
		bannersNewClientsPage.clickBtnSave();

		// VP1. A message : "Client successfully saved" shows and edit client page displays
		assertEquals(bannersEditClientPage.getMessageText(), "Client saved.",
				"Message Client saved should be displayed");
		assertTrue(bannersEditClientPage.doesEditPageDisplays(),
				"Edit page should be displayed");

		Log4j.info("Step 7. Update new client form");
		bannersEditClientPage.updateNewClientForm(titleName1,
				Utilities.getContactName(), Utilities.getContactEmail());

		Log4j.info("Step 8. Click button save and close");
		bannersNewClientsPage.clickBtnSaveAndClose();

		// VP2. A message : "Client successfully saved" shows and Client is edited
		assertEquals(bannersClientsPage.getMessageText(), "Client saved.",
				"Message client saved should be displayed");
		assertTrue(bannersClientsPage.doesElelementExists(titleName1), "Element is not exist");
	}

	@AfterMethod
	public void AfterMethod(){
		Log4j.info("Step 9. Clean Data");
		bannersClientsPage.cleanData();
	}
}

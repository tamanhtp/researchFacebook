package testNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import test.pages.BannersClientsPage;
import test.pages.BannersNewClientsPage;
import test.pages.BannersPage;
import test.pages.HomePage;
import test.pages.LoginPage;
import test.utils.Constants;
import test.utils.Log4j;
import test.utils.Utilities;

public class TC_JOOMLA_BANNERS_CLIENTS_003 extends TestHelper {
	HomePage homePage = new HomePage();
	BannersPage bannersPage = new BannersPage();
	BannersClientsPage bannersClientsPage = new BannersClientsPage();
	BannersNewClientsPage bannersNewClientsPage = new BannersNewClientsPage();
	String titleName = Utilities.getName();
	
	@BeforeMethod
	public void beforeMethod(){
		Log4j.info("Step 1. Login");
		LoginPage.login(Constants.LOGIN_USERNAME, Constants.LOGIN_PASSWORD);

		Log4j.info("Step 2. Go to banner page ");
		homePage.goToBannerPage();

		Log4j.info("Step 3. Go to banner client page ");
		bannersPage.goToBannersClientsPage();

		Log4j.info("Step 4. Go to new client page");
		bannersClientsPage.clickBtnNew();
	}

	@Test(description = "TC_JOOMLA_BANNERS_CLIENTS_003-Verify that user can publish a client")
	public void f(){
		Log4j.info("Step 5. Fill new client form");
		bannersNewClientsPage.fillNewClientForm(titleName,
				Utilities.getContactName(), Utilities.getContactEmail(),
				"Unpublished");

		Log4j.info("Step 6. Click save and close");
		bannersNewClientsPage.clickBtnSaveAndClose();

		// VP 1. A message : "Client successfully saved" shows and new client is created
		assertEquals(bannersClientsPage.getMessageText(),  "Client saved.",
				"Message client saved should be displayed");
		assertTrue(bannersClientsPage.doesElelementExists(titleName), "Element is not exist");

		Log4j.info("Step 7. Check Clients");
		bannersClientsPage.selectCheckbox(titleName);

		Log4j.info("Step 8. Click Publish button");
		bannersClientsPage.clickBtnPublish();

		// A message : "1 client successfully published" shows and Client is published
		assertEquals(bannersClientsPage.getMessageText(),  "1 client published.",
				"Message 1 client published should be displayed");
		assertTrue(bannersClientsPage.doesElementStatus(titleName,
				"publish"), "Element does not exist");
	}
	
	@AfterMethod
	public void afterMethod(){
		Log4j.info("Step 9. Clean Data");
		bannersClientsPage.cleanData();
	}
}

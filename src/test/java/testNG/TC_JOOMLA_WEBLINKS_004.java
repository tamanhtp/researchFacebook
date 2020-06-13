package testNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import test.pages.HomePage;
import test.pages.LoginPage;
import test.pages.WebLinksNewPage;
import test.pages.WebLinksPage;
import test.utils.Constants;
import test.utils.Log4j;
import test.utils.Utilities;

public class TC_JOOMLA_WEBLINKS_004 extends TestHelper {

	HomePage homePage = new HomePage();
	WebLinksPage webLinksPage = new WebLinksPage();
	WebLinksNewPage webLinksNewPage = new WebLinksNewPage();
		
	String title = "Test WEBLINKS_004"+Utilities.timerNow();
	String url = "http://www.joomla.org";
	
	@BeforeMethod
	public void beforeMethod() {
		Log4j.info("Step 1. Login");
		LoginPage.login(Constants.LOGIN_USERNAME, Constants.LOGIN_PASSWORD);
				
		Log4j.info("Step 2. Go to Weblinks page");
		homePage.goToWebLinksPage();
		
		Log4j.info("Step 3. Click button new redirect New WebLinks page");
		webLinksPage.goToWebLinksNewPage();
	}
	@Test(description = "TC_JOOMLA_WEBLINKS_004 - Verify user can unpublish a published web link")
	public void f() throws InterruptedException {
				
		Log4j.info("Step 4. Create new");
		webLinksNewPage.createNew(title,Utilities.getTitle(),url,Utilities.getContent(),webLinksNewPage._status_Published);
		
		Log4j.info("Step 5. save and close");
		webLinksNewPage.clickBtnSaveAndClose();
				
		Log4j.info("Step 6. Verify the web link is saved successfully");
		assertEquals(webLinksPage.checkSaved(), true);
		assertEquals(webLinksPage.checkCreationByTitle(title), true);

		Log4j.info("Step 7. Check on the recently added article's checkbox");
		webLinksPage.selectCheckboxWithTitle(title);
		
		Log4j.info("Step 8. Click on 'Publich' icon of the top right toolbar");
		webLinksPage.clickBtnPublish();
				
		Log4j.info("Step 9. Verify the web link is published successfully");
		assertEquals(webLinksPage.doesIconUnpublishDisplayed(title), true);
		assertEquals(webLinksPage.checkUnpublished(), true);
		
	}
	@AfterMethod
	public void AfterMethod() {
		Log4j.info("Clean Data");
		webLinksPage.cleanData();
	}
}

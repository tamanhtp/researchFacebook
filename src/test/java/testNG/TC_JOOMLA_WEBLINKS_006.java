package testNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import test.pages.HomePage;
import test.pages.LoginPage;
import test.pages.WebLinksNewPage;
import test.pages.WebLinksPage;
import test.utils.Constants;
import test.utils.Log4j;
import test.utils.Utilities;

public class TC_JOOMLA_WEBLINKS_006 extends TestHelper {

	HomePage homePage = new HomePage();
	WebLinksPage webLinksPage = new WebLinksPage();
	WebLinksNewPage webLinksNewPage = new WebLinksNewPage();
		
	String title = "Test WEBLINKS_006"+Utilities.timerNow();
	String url = "http://www.joomla.org";
	TestHelper testHelper = new TestHelper();
	
	
	@BeforeMethod
	public void beforeMethod() {
		Log4j.info("Step 1. Login");
		LoginPage.login(Constants.LOGIN_USERNAME, Constants.LOGIN_PASSWORD);
				
		Log4j.info("Step 2. Go to Weblinks page");
		homePage.goToWebLinksPage();
		
		Log4j.info("Step 3. Click button new redirect New WebLinks page");
		webLinksPage.goToWebLinksNewPage();
	}
	@Parameters("browser")
	@Test(description = "TC_JOOMLA_WEBLINKS_006 - Verify user can check-in a weblink")
	public void f(String browser) throws InterruptedException {
		
		Log4j.info("Step 4. Create new");
		webLinksNewPage.createNew(title,Utilities.getTitle(),url,Utilities.getContent(),webLinksNewPage._status_Published);
		
		Log4j.info("Step 5. Save");
		webLinksNewPage.clickBtnSave();
		
		Log4j.info("Step 6. Close Browser, open new, login, goto weblink ");
		Constants.DRIVER.close();
//		testHelper.beforeClass(browser);
		Constants.DRIVER.get(Constants.URL_ADMINISTRATOR);
		LoginPage.login(Constants.LOGIN_USERNAME, Constants.LOGIN_PASSWORD);
		homePage.goToWebLinksPage();

		Log4j.info("Step 7. Check on the recently added weblink's checkbox");
		webLinksPage.selectCheckboxWithTitle(title);
		assertEquals(webLinksPage.checkCheckinIconbyTitle(title), true);
		
		Log4j.info("Step 8. Click on 'Check In' icon of the top right toolbar");
		webLinksPage.clickBtnCheckin();
		
		Log4j.info("Step 9. Verify the weblink is checked in successfully");
		assertEquals(webLinksPage.checkCheckinIconbyTitle(title), false);
				
	}
	@AfterMethod
	public void AfterMethod() {
		Log4j.info("Clean Data");
		webLinksPage.cleanData();
	}
}

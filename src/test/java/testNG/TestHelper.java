package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Parameters;

import test.pages.GeneralPage;
import test.utils.BrowserHelper;
import test.utils.Constants;
import test.utils.Log4j;

public class TestHelper {

	GeneralPage generalPage = new GeneralPage();

	@BeforeClass
//	@Parameters("browser")
	public void beforeClass() {
//		if (browser.equals("firefox")) {
//			BrowserHelper.openFirefoxBrowser(Constants.URL_ADMINISTRATOR);
//		}

//		else if (browser.equals("chrome")) {
			BrowserHelper.openChromeBrowser(Constants.URL_ADMINISTRATOR);
//		}

//		else if (browser.equals("ie")) {
//			BrowserHelper.openIeBrowser(Constants.URL_ADMINISTRATOR);
//		}
	}

	@AfterClass
	public void afterClass(){
		Log4j.info("Close Browser");
//		Constants.DRIVER.quit();
	}
}

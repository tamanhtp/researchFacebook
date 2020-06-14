package testNG;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import test.pages.FB_Homepage_RememberPass;
import test.pages.FB_LoginPage;
import test.pages.FB_PostStatus;
import test.utils.Constants;
import test.utils.Log4j;

public class FB_Login extends TestHelper {

	@BeforeMethod
	public void beforeMethod() {
		Log4j.info("Step 1. Login");
		FB_LoginPage.login(Constants.LOGIN_USERNAME, Constants.LOGIN_PASSWORD);
		Constants.DRIVER.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FB_Homepage_RememberPass.Cancel();
		FB_PostStatus.Post();
	}

	@Test(description = "FB Login")
	public void f() {
		}

	@AfterMethod
	public void AfterMethod(){
		Constants.DRIVER.quit();
	}
}

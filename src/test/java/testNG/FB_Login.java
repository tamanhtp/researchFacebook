package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.pages.FB_LoginPage;
import test.utils.Constants;
import test.utils.Log4j;

public class FB_Login extends TestHelper {

	@BeforeMethod
	public void beforeMethod() {
		Log4j.info("Step 1. Login");
		FB_LoginPage.login(Constants.LOGIN_USERNAME, Constants.LOGIN_PASSWORD);

	}

	@Test(description = "FB Login")
	public void f() {
		}

	@AfterMethod
	public void AfterMethod(){
	}
}

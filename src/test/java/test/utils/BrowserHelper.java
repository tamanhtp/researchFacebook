package test.utils;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class BrowserHelper {
	public static void openChromeBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		Constants.DRIVER = new ChromeDriver(options);
		getURL(url);
	}

	public static void openFirefoxBrowser(String url) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("start-maximized");
		Constants.DRIVER = new FirefoxDriver(options);
		getURL(url);
	}

	public static void openIeBrowser(String url) {
		WebDriverManager.iedriver().setup();
		InternetExplorerOptions options = new InternetExplorerOptions();
		Constants.DRIVER = new InternetExplorerDriver(options);
		Constants.DRIVER.manage().window().maximize();
		getURL(url);
	}
	public static void getURL(String url) {
		Constants.DRIVER.get(url);
	}
}

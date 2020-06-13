package test.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utilities {

	public static void findElementInIframe(By iframe, By childen, String text)
			throws InterruptedException {
		WebElement iframeElement = Constants.DRIVER.findElement(iframe);
		Constants.DRIVER.switchTo().frame(iframeElement);
		Thread.sleep(300);
		Constants.DRIVER.findElement(childen).sendKeys(text);
		Constants.DRIVER.switchTo().defaultContent();
	}

	// FAKER
	public static String getTitle() {
		return Constants.FAKER.book().title() + " - " + timerNow();
	}

	public static String getName() {
		return Constants.FAKER.address().firstName();
	}

	public static String getContactName() {
		return Constants.FAKER.address().lastName();
	}

	public static String getContactEmail() {
		return Constants.FAKER.internet().emailAddress();
	}

	public static String getContent() {
		return Constants.FAKER.address().fullAddress();
	}

	public static String timerNow() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HHmmss");
		LocalDateTime now = LocalDateTime.now();
		String result = dtf.format(now);
		return result;
	}

	public static String stringFormat(String xpath, String variable) {
		return String.format(xpath, variable);
	}
}

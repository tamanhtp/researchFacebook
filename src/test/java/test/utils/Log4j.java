package test.utils;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4j {

	public static Logger logger = LogManager.getLogger("Debug");

	public Log4j() {
		DOMConfigurator.configure("log4j.xml");
	}

	public static void info(String message) {

		logger.info(message);
	}

	public static void assertLog(String message) {

		logger.assertLog(false, message);
	}

	public static void debug(String message) {

		logger.debug(message);
	}

	public static void error(String message) {

		logger.error(message);
	}

	public static void fatal(String message) {

		logger.fatal(message);
	}

	public static void notify(String message) {

		logger.notify();
	}

}

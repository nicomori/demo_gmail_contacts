package com.demo.gmail.contacts.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenBrowserChrome {

	public static WebDriver openBowserWithOutCapabilities(WebDriver driver) {

		String oS = System.getProperty("os.name").toLowerCase();

		if (oS.contains("windows")) {
			System.setProperty("webdriver.chrome.driver", "C:/DriversBrowser/chromedriver.exe");

		} else if (oS.contains("mac")) {
			System.setProperty("webdriver.chrome.driver",
					"/Users/nico/Documents/github/example_demo_nicolasmori/chromedriver");
		} else {
			System.out.println("This is the OS: " + oS);
			System.out.println("OS is not compatible, you need define the path of the chromedriver again");
			System.exit(0);
		}

		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("start-maximized");
		options.addArguments("--js-flags=--expose-gc");
		options.addArguments("--enable-precise-memory-info");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-default-apps");
		options.addArguments("test-type=browser");
		options.addArguments("disable-infobars");

		driver = new ChromeDriver(options);

		return driver;
	}

}

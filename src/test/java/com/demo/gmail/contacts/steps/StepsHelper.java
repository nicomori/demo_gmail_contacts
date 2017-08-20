package com.demo.gmail.contacts.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.demo.gmail.contacts.pageobject.web.ContactsHomePage;
import com.demo.gmail.contacts.pageobject.web.HomePage;
import com.demo.gmail.contacts.pageobject.web.LoginEmailPage;
import com.demo.gmail.contacts.pageobject.web.LoginPassPage;
import com.demo.gmail.contacts.util.SelectorBrowser;

public class StepsHelper {

	protected WebDriver driver;
	protected static LoginEmailPage loginEmailPage;
	protected static LoginPassPage loginPassPage;
	protected static HomePage homePage;
	protected static ContactsHomePage contactsHomePage;

	/**
	 * this method execute the browser selected previously and send the url to the browser
	 * 
	 * @param String
	 *            with the browser name.
	 * 
	 * @return LoginEmailPage
	 */
	protected LoginEmailPage startBrowser(String url) {
		System.out.println("Starting driver for Browser Chrome");
		driver = SelectorBrowser.createDriverWithoutCapabilities("chrome", driver);
		navigateTo(url);
		return PageFactory.initElements(driver, LoginEmailPage.class);
	}

	/**
	 * this method send the url to the browser
	 * 
	 * @param String
	 *            with the url
	 */
	protected void navigateTo(String url) {
		System.out.println("Starting to send the url: " + url);
		driver.navigate().to(url);
	}
}

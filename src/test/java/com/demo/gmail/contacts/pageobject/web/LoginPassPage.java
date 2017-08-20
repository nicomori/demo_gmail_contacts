package com.demo.gmail.contacts.pageobject.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPassPage extends PageHelper {

	public LoginPassPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@name='password']")
	WebElement fieldPass;

	@FindBy(id = "passwordNext")
	WebElement buttonNext;

	/**
	 * this method set the password and make click in the button next
	 * 
	 * @param String
	 *            with the pass
	 * 
	 * @return HomePage
	 */
	public HomePage loginIntoTheApp(String pass) {
		System.out.println("Starting to send the password: " + pass);
		waitForAnExplicitWebElement("//input[@name='password']");
		fieldPass.sendKeys(pass);
		buttonNext.click();
		return PageFactory.initElements(driver, HomePage.class);
	}

}

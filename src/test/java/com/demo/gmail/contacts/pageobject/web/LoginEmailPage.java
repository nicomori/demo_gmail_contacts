package com.demo.gmail.contacts.pageobject.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginEmailPage extends PageHelper {

	public LoginEmailPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "identifierId")
	WebElement fieldEmail;

	@FindBy(id = "identifierNext")
	WebElement buttonNext;

	/**
	 * this method set the user and make click in the button next.
	 * 
	 * @param String
	 *            with the user
	 * 
	 * @return LoginPassPage
	 */
	public LoginPassPage loginIntoTheApp(String user) {
		System.out.println("Starting to send the user: " + user + " to the userField");
		fieldEmail.sendKeys(user);
		buttonNext.click();
		return PageFactory.initElements(driver, LoginPassPage.class);
	}
}
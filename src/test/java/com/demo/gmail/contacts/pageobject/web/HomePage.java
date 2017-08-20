package com.demo.gmail.contacts.pageobject.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageHelper {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//span[text()='Gmail'])[2]")
	WebElement buttonGmail;

	@FindBy(xpath = "(//div[@role='menuitem'])[2]")
	WebElement optionListContacs;

	/**
	 * this method make click in the burron GMAIL and select the option contacts
	 * 
	 * @return ContactsHomePage
	 */
	public ContactsHomePage accessToTheOptionContacts() {
		System.out.println("Starting to make click in the button Gmail, and selecting the option Contacts");
		waitForAnExplicitWebElement("(//span[text()='Gmail'])[2]");
		buttonGmail.click();
		optionListContacs.click();
		return PageFactory.initElements(driver, ContactsHomePage.class);
	}

}

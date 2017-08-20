package com.demo.gmail.contacts.pageobject.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsHomePage extends PageHelper {

	public ContactsHomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@jsshadow]/content/div")
	WebElement buttonPlus;

	@FindBy(xpath = "(//input[@data-initial-value])[1]")
	WebElement popUpAddNewUserEditFieldName;

	@FindBy(xpath = "//span[text()='Guardar']")
	WebElement popUpAddNewUserButtonSave;

	@FindBy(xpath = "//div[@data-tooltip='Cerrar']")
	WebElement popUpAddNewUserButtonClose;

	@FindBy(xpath = "//div[@data-open-in-edit-mode='false']//div[@data-tooltip='Editar contacto']")
	WebElement buttonEditContact;

	@FindBy(xpath = "//div[@data-open-in-edit-mode='false']//div[@data-tooltip='Más acciones']")
	WebElement buttonMoreActions;

	@FindBy(xpath = "//div[@data-stay-open='true']//div[text()='Eliminar']")
	WebElement popUpMoreActionOptionDelete;

	@FindBy(xpath = "//span[text()='Eliminar']")
	WebElement popUpButtonConfirmationButtonDelete;

	String CONTACT = "//span[text()='%s']";

	/**
	 * This method is created for add a new user into the contacts
	 * 
	 * @param String
	 *            the name to put.
	 */
	public void addNewUser(String nameNewContact) {
		System.out.println("Starting to add this new contact: " + nameNewContact);
		changeOfTab(1);
		waitForAnExplicitWebElement("//div[@jsshadow]/content/div");
		buttonPlus.click();
		waitForAnExplicitWebElement("(//input[@data-initial-value])[1]");
		popUpAddNewUserEditFieldName.sendKeys(nameNewContact);
		popUpAddNewUserButtonSave.click();
		waitForAnExplicitWebElement("//div[@data-tooltip='Cerrar']");
		popUpAddNewUserButtonClose.click();
		driver.quit();
	}

	/**
	 * This method is edit a contacts.
	 * 
	 * @param String
	 *            the name to modify.
	 * @param String
	 *            the new name.
	 */
	public void editContact(String contactToEdit, String contactNewName) {
		System.out.println("Starting the process to change the contact name from: " + contactToEdit + " to this: "
				+ contactNewName);
		changeOfTab(1);
		waitForAnExplicitWebElement("//div[@jsshadow]/content/div");
		driver.findElement(By.xpath(String.format(CONTACT, contactToEdit))).click();
		waitForAnExplicitWebElement("//div[@data-open-in-edit-mode='false']//div[@data-tooltip='Editar contacto']");
		clickJS(buttonEditContact);
		waitForAnExplicitWebElement("(//input[@data-initial-value])[1]");
		popUpAddNewUserEditFieldName.clear();
		popUpAddNewUserEditFieldName.sendKeys(contactNewName);
		popUpAddNewUserButtonSave.click();
		waitForAnExplicitWebElement("//div[@data-tooltip='Cerrar']");
		clickJS(popUpAddNewUserButtonClose);
		driver.quit();
	}

	/**
	 * This method is created for delete a contact.
	 * 
	 * @param String
	 *            with the contact to delete.
	 */
	public void deleteContact(String contactToDelete) {
		System.out.println("Starting the process to delete the contact: " + contactToDelete);
		changeOfTab(1);
		waitForAnExplicitWebElement("//div[@jsshadow]/content/div");
		driver.findElement(By.xpath(String.format(CONTACT, contactToDelete))).click();
		waitForAnExplicitWebElement("//div[@data-open-in-edit-mode='false']//div[@data-tooltip='Editar contacto']");
		clickJS(buttonMoreActions);
		waitSleepingTheTread(4000);
		popUpMoreActionOptionDelete.click();
		waitForAnExplicitWebElement("//span[text()='Eliminar']");
		popUpButtonConfirmationButtonDelete.click();
		driver.quit();
	}
}

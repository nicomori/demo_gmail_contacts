package com.demo.gmail.contacts.steps;

import cucumber.api.java.en.And;

public class Steps extends StepsHelper {

	@And("I set my user with this email \"(.*)?\" and press in the button next")
	public void setUserName(String email) {
		System.out.println("Starting to set the user name");
		loginPassPage = loginEmailPage.loginIntoTheApp(email);
	}

	@And("I set my pass with this \"(.*)?\" and press in the button next")
	public void setUserPass(String pass) {
		System.out.println("Starting to set the pass");
		homePage = loginPassPage.loginIntoTheApp(pass);
	}

	@And("I access to the part of contacts")
	public void accessToTheContactPage() {
		System.out.println("Starting to access to the contacts page");
		contactsHomePage = homePage.accessToTheOptionContacts();
	}

	@And("I access a new contact with this name \"(.*)?\"")
	public void createANewContact(String newContact) {
		System.out.println("Starting to create a new user");
		contactsHomePage.addNewUser(newContact);
	}

	@And("I update this contact \"(.*)?\" with this other name \"(.*)?\"")
	public void updateAContact(String oldContact, String newContact) {
		System.out.println("Starting to update the old user with the new name");
		contactsHomePage.editContact(oldContact, newContact);
	}

	@And("I delete this contact \"(.*)?\"")
	public void deleteAContact(String contactToDelete) {
		System.out.println("Starting to delete a contact");
		contactsHomePage.deleteContact(contactToDelete);
	}
}
package com.demo.gmail.contacts.steps;

import cucumber.api.java.en.Given;

public class StepsGeneric extends StepsHelper {

	@Given("I start the browser and access to this \"(.*)?\"")
	public void accessToTheBrowser(String url) {
		System.out.println("Starting the browser and setting the url: " + url);
		loginEmailPage = startBrowser(url);
	}
}
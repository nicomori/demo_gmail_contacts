@Regression @createANewContact
Feature: Interview Nicolas Mori

Scenario Outline: Access to the app after make the login.

Given I start the browser and access to this "<url>"
And I set my user with this email "<email>" and press in the button next
And I set my pass with this "<pass>" and press in the button next
And I access to the part of contacts
And I access a new contact with this name "<new contact name>"

Examples:
| url     					| email 		 		 		| pass		 | new contact name 	|
| https://mail.google.com 	| nicolas.mori.demo@gmail.com   | A45224610b | AAAAAAAAAAAAAAAAA	|

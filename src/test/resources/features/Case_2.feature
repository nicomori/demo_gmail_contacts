@Regression @updateContact
Feature: Interview Nicolas Mori

Scenario Outline: Access to the app after make the login.ddddd

Given I start the browser and access to this "<url>"
And I set my user with this email "<email>" and press in the button next
And I set my pass with this "<pass>" and press in the button next
And I access to the part of contacts
And I update this contact "<currect contact>" with this other name "<new contact>"

Examples:
| url     					| email 				   	  | pass	   | currect contact 	| new contact	 	|
| https://mail.google.com 	| nicolas.mori.demo@gmail.com | A45224610b | AAAAAAAAAAAAAAAAA	| AAAAAAAAAAAAAAAA1	|
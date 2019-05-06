package com.demo.gmail.contacts;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Unit test for simple App . dddd. ddddsssswww
 */
@CucumberOptions(plugin = { "html:target/cucumber-html-reports", "json:target/cucumber-html-reports/cucumber.json",
		"junit:target/surefire-reports/cucumber-junit.xml" }, features = "src/test/resources/features", tags = "@pepe2", glue = {
				"com.demo.gmail.contacts.steps" })
public class AppTest extends AbstractTestNGCucumberTests {
}

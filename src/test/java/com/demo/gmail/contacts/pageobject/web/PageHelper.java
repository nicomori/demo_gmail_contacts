package com.demo.gmail.contacts.pageobject.web;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageHelper {

	protected WebDriver driver;

	protected PageHelper(WebDriver driver) {
		this.driver = driver;
	}

	protected void waitForAnExplicitWebElement(String webElementInString) {
		@SuppressWarnings("unused")
		WebElement dinamicElementWaiter = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(webElementInString)));
	}

	protected void changeOfTab(int tabToChange) {
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
	}

	protected void clickJS(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

	protected void waitSleepingTheTread(int timeInMiliseconds) {
		try {
			Thread.sleep(timeInMiliseconds);
		} catch (Exception e) {
			System.out.println("Appear a problem waiting");
		}
	}

}

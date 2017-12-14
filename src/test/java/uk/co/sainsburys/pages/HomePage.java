package uk.co.sainsburys.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;
	WebElement searchElement;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterProductName(){
		searchElement = driver.findElement(By
				.xpath(".//input[@id='headerSearchInput_7777']"));
		searchElement.sendKeys("Soaps");
	}
}

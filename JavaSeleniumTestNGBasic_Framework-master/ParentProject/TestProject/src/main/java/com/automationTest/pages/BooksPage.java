package com.automationTest.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.framework.exceptions.DriverNotInitializedException;
import com.framework.page.BasePage;
import com.framework.page.TestPage;

public class BooksPage extends BasePage implements TestPage {

	public BooksPage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
		
	}
	
	@FindBy(xpath="//div[@class='siteHeader__topLine gr-box gr-box--withShadow']//ul/li[2]//a[text()='My Books']")
	private WebElement MyBooks;
	
	/*
	 * @FindBy(xpath="//a[contains(text(),'2011 AWARDS')]") private WebElement
	 * Link2011;
	 */
	
	
	
	
	
	
	
	public BooksPage verifySort() {
		
		wait.until(ExpectedConditions.visibilityOf(MyBooks)).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		
		
		return this;
	}
}

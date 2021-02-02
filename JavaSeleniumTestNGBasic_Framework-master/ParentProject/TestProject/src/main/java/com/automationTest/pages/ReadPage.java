package com.automationTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.framework.exceptions.DriverNotInitializedException;
import com.framework.page.BasePage;
import com.framework.page.TestPage;

public class ReadPage extends BasePage implements TestPage {

	public ReadPage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
		
	}
	
	@FindBy(xpath="//div[@class='siteHeader__topLine gr-box gr-box--withShadow']//ul/li[2]//a[text()='My Books']")
	private WebElement MyBooks;
	
	@FindBy(xpath="//div[@id='paginatedShelfList']/div[3]/a")
	private WebElement WantToRead;
	
	@FindBy(xpath="//div[@class='elementList']//div/a")
	private WebElement GroupList;
	
	@FindBy(xpath="//a[text()='Edit Group Settings']")
	private WebElement EditGroupLink;
	
	
	public ReadPage wantToRead()
	{
		wait.until(ExpectedConditions.visibilityOf(MyBooks)).click();
		String abc = WantToRead.getText();
		String a = abc.replaceAll("[^0-9]", "");
		int oldNumber = Integer.parseInt(a);
		System.out.println("old count for want to read is :- " +oldNumber);
		
		return this;
	}
	
	
	
	
	
	
	
	
	
	//div[@class='siteHeader__topLine gr-box gr-box--withShadow']//ul/li[2]//a[text()='My Books']

}

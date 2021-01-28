package com.automationTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.framework.exceptions.DriverNotInitializedException;
import com.framework.page.BasePage;
import com.framework.page.TestPage;

public class AwardsPage extends BasePage implements TestPage {
	
	
	@FindBy(xpath="//*[@class='navGroup productNav withArrows']/li[1]") 
	private WebElement Flights;
	
	@FindBy(xpath="//*[@class='navGroup productNav withArrows']/li[2]") 
	private WebElement Hotels;
	
	@FindBy(xpath="//*[@class='navGroup productNav withArrows']/li[3]") 
	private WebElement Activities;
	
	@FindBy(xpath="//*[@class='navGroup productNav withArrows']/li[4]") 
	private WebElement Trains;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public AwardsPage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
		
	}
	
	
	
	
	

}

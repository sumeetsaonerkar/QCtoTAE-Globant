package com.automationTest.pages;

import java.util.List;

import org.apache.commons.logging.Log;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.framework.base.Loggers;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.page.BasePage;
import com.framework.page.TestPage;

public class AwardsPage extends BasePage implements TestPage {
	
	
	public AwardsPage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
		
	}
	
	
	
	@FindBy(xpath="//div[@class='siteHeader__topLine gr-box gr-box--withShadow']//ul/li[3]/div")
	private WebElement Browse;
	
	@FindBy(xpath="//div[@class='siteHeader__topLine gr-box gr-box--withShadow']//ul/li[3]/div//ul[@class='siteHeader__subNav']/li[2]")
	private WebElement ChoiceAwards;
	
	@FindBy(xpath="//a[text()='2011 AWARDS']")
	private WebElement link2011;
	
	/*
	 * @FindBy(xpath="//div[@class='categoryContainer']/div/a/h4") private
	 * WebElement BooksList;
	 */
	@FindBys(@FindBy(xpath="//div[@class='categoryContainer']/div/a/h4"))
	private List<WebElement> BooksList;
		
	
public AwardsPage awardssss() {
		
		wait.until(ExpectedConditions.visibilityOf(Browse)).click();
		wait.until(ExpectedConditions.visibilityOf(ChoiceAwards)).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		wait.until(ExpectedConditions.visibilityOf(link2011)).click();
	
		
//		wait.until(ExpectedConditions.visibilityOf((WebElement) BooksList));
		
		System.out.println("size of elements is :" +BooksList.size());
		for(int i=0; i<BooksList.size(); i++)
		{
			Loggers.getInfoLog("catagory of awards bagged in 2011");
			System.out.println(BooksList.get(i).getText());
		}
	
		return this;
	}
	

	
	
	
	

}

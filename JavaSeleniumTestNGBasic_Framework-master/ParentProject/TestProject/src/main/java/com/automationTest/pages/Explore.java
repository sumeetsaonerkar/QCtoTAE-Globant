package com.automationTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.framework.exceptions.DriverNotInitializedException;
import com.framework.page.BasePage;
import com.framework.page.TestPage;

public class Explore extends BasePage implements TestPage {
	
	
	
	public Explore(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
		
	}

	@FindBy(id="explore_search_query")
	private WebElement EnterBook;
	
	@FindBy(xpath="//div[@class='greyText fieldsToSearch']/input[@id='search_field_title']")
	private WebElement TitleClick;
	
	@FindBy(xpath="//input[@class='searchBox__button searchBox--large__button']")
	private WebElement Search;
	
	@FindBy(xpath="//table[@class='tableList']/tbody/tr[1]/td[2]/a[1]")
	private WebElement FirstBook;
	
	@FindBy(xpath="//div[@id='lazy_loadable_view']/div[1]/div/div/a[text()='Recommend This Book']")
	private WebElement RecommendButton;
	
	
	
	public Explore sendRecommendation(String bookname) {
		
	wait.until(ExpectedConditions.visibilityOf(TitleClick)).click();
	wait.until(ExpectedConditions.visibilityOf(Search)).sendKeys(bookname);
	wait.until(ExpectedConditions.visibilityOf(Search)).click();
	wait.until(ExpectedConditions.visibilityOf(FirstBook)).click();
	wait.until(ExpectedConditions.visibilityOf(RecommendButton)).click();
		
		return this;
	}
	

}

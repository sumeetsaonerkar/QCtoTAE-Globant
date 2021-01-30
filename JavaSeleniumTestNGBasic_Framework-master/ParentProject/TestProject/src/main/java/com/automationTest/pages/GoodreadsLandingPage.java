package com.automationTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.framework.base.PropertyLoader;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.page.BasePage;
import com.framework.page.TestPage;

public class GoodreadsLandingPage extends BasePage implements TestPage {
	
	
	public GoodreadsLandingPage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
		
	}

	/*
	 * @FindBy(xpath="//a[@data-reactid='.2bly6fbvqps.1.0.2.0.0.0']") private
	 * WebElement Home;
	 * 
	 * @FindBy(xpath="//a[@data-reactid='.2bly6fbvqps.1.0.2.0.1.0']") private
	 * WebElement MyBooks;
	 */
	
	@FindBy(xpath="//div[@class='siteHeader__topLine gr-box gr-box--withShadow']//ul/li[3]/div")
	private WebElement Browse;
	
	@FindBy(xpath="//div[@class='siteHeader__topLine gr-box gr-box--withShadow']//ul/li[3]/div//ul[@class='siteHeader__subNav']/li[2]")
	private WebElement ChoiceAwards;
	
	@FindBy(xpath="//div[@class='siteHeader__topLine gr-box gr-box--withShadow']//ul/li[3]/div//ul[@class='siteHeader__subNav']/li[7]")
	private WebElement Explore;
	
	@FindBy(className="searchBox__input searchBox__input--navbar")
	private WebElement SearchBooks;
	
	@FindBy(xpath="//div[@class='dropdown dropdown--profileMenu']")
	private WebElement ClickProfileIcon;
	
	@FindBy(xpath="//div[@class='dropdown dropdown--profileMenu']/div/div/ul/li[13]")
	private WebElement SignOutLink;
	
	@FindBy(id="explore_search_query")
	private WebElement EnterBook;
	
	@FindBy(xpath="//div[@class='greyText fieldsToSearch']/input[@id='search_field_title']")
	private WebElement TitleClick;
	
	@FindBy(xpath="//input[@class='searchBox__button searchBox--large__button']")
	private WebElement Search;
	
	@FindBy(xpath="//span[text()='Getting Things Done: The Art of Stress-Free Productivity']")
	private WebElement BookResults;
	
	
	public GoodreadsLandingPage sendRecommendation(String bookname) {
		
	wait.until(ExpectedConditions.visibilityOf(Browse)).click();
	wait.until(ExpectedConditions.visibilityOf(Explore)).click();
	wait.until(ExpectedConditions.visibilityOf(TitleClick)).click();
	wait.until(ExpectedConditions.visibilityOf(EnterBook)).click();
	EnterBook.sendKeys(bookname);
	wait.until(ExpectedConditions.visibilityOf(Search)).click();
	wait.until(ExpectedConditions.visibilityOf(BookResults)).click();
	
	
	

	
		
		return this;
	}
	
	public GoodreadsLandingPage signOut()
	{
		
		wait.until(ExpectedConditions.visibilityOf(ClickProfileIcon));
		ClickProfileIcon.click();
		wait.until(ExpectedConditions.visibilityOf(SignOutLink));
		SignOutLink.click();
		return this;
	}
	
	public GoodreadsLandingPage awardssss() {
		
		wait.until(ExpectedConditions.visibilityOf(Browse));
		Browse.click();
		wait.until(ExpectedConditions.visibilityOf(ChoiceAwards));
		ChoiceAwards.click();
		return this;
	}
	
	
	
	


		
		
	
	
}

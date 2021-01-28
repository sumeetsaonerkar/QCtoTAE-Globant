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
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[@data-reactid='.2bly6fbvqps.1.0.2.0.0.0']")
	private WebElement Home;
	
	@FindBy(xpath="//a[@data-reactid='.2bly6fbvqps.1.0.2.0.1.0']")
	private WebElement MyBooks;
	
	@FindBy(xpath="//div[@class='siteHeader__topLine gr-box gr-box--withShadow']//ul/li[3]/div")
	private WebElement Browse;
	
	@FindBy(xpath="//div[@class='siteHeader__topLine gr-box gr-box--withShadow']//ul/li[3]/div//ul[@class='siteHeader__subNav']/li[2]")
	private WebElement ChoiceAwards;
	
	@FindBy(xpath="//a[@data-reactid='.1n7wlueq7sw.1.0.2.0.3.0.0']/span")
	private WebElement Community;
	
	@FindBy(className="searchBox__input searchBox__input--navbar")
	private WebElement SearchBooks;
	
	@FindBy(xpath="//div[@class='genres_form']")
	private WebElement GenresList;
	
	@FindBy(xpath="//li[@data-reactid='.gfwedtsvls.1.0.4.0.4.0.1.0.1.9']")
	private WebElement FavouriteGenres;
	
	@FindBy(xpath="//div[@class='dropdown dropdown--profileMenu']")
	private WebElement ClickProfileIcon;
	
	@FindBy(xpath="//div[@class='dropdown dropdown--profileMenu']/div/div/ul/li[13]")
	private WebElement SignOutLink;
	
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

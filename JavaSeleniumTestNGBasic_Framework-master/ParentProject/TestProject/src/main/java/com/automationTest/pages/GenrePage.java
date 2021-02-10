package com.automationTest.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.framework.exceptions.DriverNotInitializedException;
import com.framework.page.BasePage;
import com.framework.page.TestPage;

public class GenrePage extends BasePage implements TestPage {

	public GenrePage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
		
		
	}
	
	@FindBy(xpath="//div[@class='dropdown dropdown--profileMenu']")
	private WebElement UserprofileIcon;
	
	@FindBy(xpath="//div[@class='dropdown dropdown--profileMenu']//a[text()='Favorite genres']")
	private WebElement FavGenre;
	

	@FindBys(@FindBy(xpath="//div[@class='genres_form']/div"))
	private List<WebElement> GenreList;
	
	@FindBys(@FindBy(xpath="//div[@id='additionalGenres']/div"))
	private List<WebElement> AdditionalGenreList;
	
	
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement ContinueButton;
	
	
	public GenrePage verifyGenreFunctionality() {
		
		wait.until(ExpectedConditions.visibilityOf(UserprofileIcon));
		UserprofileIcon.click();
		
		wait.until(ExpectedConditions.visibilityOf(FavGenre));
		FavGenre.click();
		
		System.out.println("Size of the list are " + GenreList.size() +" & the contents of genre are as below :- ");
		System.out.println("_______________________________________________________________________________________");
		
		
		for(int i=0; i<GenreList.size(); i++)
		{
			String ListValue = GenreList.get(i).getAttribute("id");
			
			System.out.println(ListValue);
			
			if(ListValue.equalsIgnoreCase("genre_Art"))
			{
				GenreList.get(i).click();
			}
			
			
			
		}
		
		System.out.println("Art genre is selected");
		System.out.println("_______________________________________________________________________________________");
		
		wait.until(ExpectedConditions.visibilityOf(ContinueButton));
		ContinueButton.click();
		
		System.out.println("additional genre list are as follows :- ");
		System.out.println("_______________________________________________________________________________________");
		
		
		for(int i=0; i<AdditionalGenreList.size(); i++)
		{
			String ListValue2 = AdditionalGenreList.get(i).getText();
			
			System.out.println(ListValue2);
		}
		
		System.out.println("_______________________________________________________________________________________");
		
		System.out.println("Art is not present in additional genre list");
		
		return this;
	}
}

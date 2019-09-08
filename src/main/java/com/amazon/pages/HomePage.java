package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.basetest.TestBase;

public class HomePage extends TestBase{

	@FindBy(id="twotabsearchtextbox")
	WebElement search_section;
	
	@FindBy(xpath="//input[@value='Go']")
	WebElement search_button;
	
	@FindBy(xpath="//span[contains(text(),'Cart')]")
	WebElement cart;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Search_Section_Feature(String search)
	{
		search_section.sendKeys(search);
	}
	
	public SearchPage Search_Button_Feature()
	{
		search_button.click();
		
		return new SearchPage();
	}
	
	public void Cart_Feature()
	{
		cart.click();
	}
}

package com.amazon.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.basetest.TestBase;

public class SearchPage extends TestBase{

	@FindBy(xpath="//span[@class='a-size-base a-color-base'][contains(text(),'Wildcraft')]")
	WebElement select_brand;
	
	@FindBy(xpath="//span[contains(text(),'Wildcraft 50 Ltrs Red Rucksack (8903338073901)')]")
	WebElement select_bag;
	
	public SearchPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Select_Brand_Feature()
	{
		select_brand.click();
	}
	
	public void Select_Bag_Feature()
	{
		String homeid= driver.getWindowHandle();
		System.out.println(homeid);
		
		select_bag.click();
		
		String childid = driver.getWindowHandle();
		System.out.println(childid);
		
		Set<String> set = driver.getWindowHandles();
		String currentid=null;
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			currentid=itr.next().toString();
			System.out.println(currentid);
		}
		if(!currentid.equals(homeid))
		{
			driver.switchTo().window(currentid);
		}
		
	}

}

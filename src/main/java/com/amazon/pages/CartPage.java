package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.basetest.TestBase;

public class CartPage extends TestBase {
	
	@FindBy(id="add-to-cart-button")
	WebElement addtocart;
	
	@FindBy(xpath="//h1[contains(text(),'Added to Cart')]")
	WebElement verify;

	@FindBy(name="proceedToCheckout")
	WebElement proceedtobuy;
	
	@FindBy(id="enterAddressFullName")
	WebElement name;
	
	@FindBy(id="enterAddressPhoneNumber")
	WebElement mno;
	
	@FindBy(id="enterAddressPostalCode")
	WebElement pincode;
	
	@FindBy(id="enterAddressAddressLine1")
	WebElement fno;
	
	@FindBy(id="enterAddressAddressLine2")
	WebElement area;
	
	@FindBy(id="enterAddressLandmark")
	WebElement landmark;
	
	@FindBy(xpath="//input[@value='Delete']")
	WebElement delete;	
	
	@FindBy(xpath="//span[contains(text(),' Subtotal (0 items):')]")
	WebElement verification;
	
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Add_To_Cart_Feature()
	{
		addtocart.click();	
	}
	
	public void Verification_Feature()
	{
		if(verify.isDisplayed())
		{
			System.out.println("Successfully added to cart");
		}
		else
		{
			System.out.println("Failed to add to the cart");
		}
	}

	public void Proceed_To_Buy_Feature()
	{
		proceedtobuy.click();
	}
	
	public void User_Info_Feature(String Name, String Mno, String Pincode, String Fno, String Area, String Landmark)
	{
		name.sendKeys(Name);
		mno.sendKeys(Mno);
		pincode.sendKeys(Pincode);
		fno.sendKeys(Fno);
		area.sendKeys(Area);
		landmark.sendKeys(Landmark);
	}
	
	public void Delete_Feature()
	{
		delete.click();
	}
	public void Delete_Verification_Feature()
	{
		if(verification.isDisplayed())
		{
			System.out.println("deleted/removed from the cart");
		}
		else 
		{
			System.out.println("not deleted/removed from the cart");
		}
	}
}
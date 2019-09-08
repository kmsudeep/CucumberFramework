package com.amzon.stepdefinition;

import java.util.Map;

import com.amazon.basetest.TestBase;
import com.amazon.pages.CartPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;
import com.amazon.pages.SearchPage;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition extends TestBase{

	LoginPage lp;
	HomePage  hp;
	SearchPage sp;
	CartPage cp;
	
	@Given("^Open the browser and enter the url$")
	public void open_the_browser_and_enter_the_url()
	{
		initialization();
	}

	@Then("^Enter the username and click on continue$")
	public void enter_the_username_and_click_on_continue()
	{
		lp = new LoginPage();
		lp.Sign_In_and_Email_Feature(prop.getProperty("username"));
	}

	@Then("^Enter the password and click on login$")
	public void enter_the_password_and_click_on_login()
	{
		lp = new LoginPage();
		hp = new HomePage();
		hp=lp.Password_and_Login_Feature(prop.getProperty("password"));
	}

	@Then("^Verify User is successfully logged in to amazon site$")
	public void verify_User_is_successfully_logged_in_to_amazon_site()
	{
		lp = new LoginPage();
		String title = lp.HomePage_Title_Feature();
		System.out.println(title);
	}
	
	@Given("^Search for the bag in the search section$")
	public void search_for_the_bag_in_the_search_section()
	{
		hp = new HomePage();
		hp.Search_Section_Feature(prop.getProperty("search"));
	}

	@Then("^Click on the Search button$")
	public void click_on_the_Search_button() 
	{
		hp = new HomePage();
		sp = new SearchPage();
		sp=hp.Search_Button_Feature();
	}

	@Then("^Select the Wildcraft Brand$")
	public void select_the_WildCrat_Brand() 
	{
		sp = new SearchPage();
		sp.Select_Brand_Feature();
	}

	@Then("^Select the Specific Bag$")
	public void select_the_Specific_Bag()
	{
		sp = new SearchPage();
		sp.Select_Bag_Feature();
	}
	
	@Then("^Click on Add to Cart link$")
	public void click_on_Add_to_Cart_link()
	{
		cp = new CartPage();
		cp.Add_To_Cart_Feature();
	}

	@Then("^Verify bag is Successfully added into cart$")
	public void verify_bag_is_Successfully_added_into_cart() 
	{
		cp = new CartPage();
		cp.Verification_Feature();
	}
	
	@Given("^Click on the Cart link from HomePage$")
	public void click_on_the_Cart_link_from_HomePage() 
	{
		hp = new HomePage();
		hp.Cart_Feature();
	}

	@Then("^Click on Proceed to Buy Page$")
	public void click_on_Proceed_to_Buy_Page() 
	{
		cp = new CartPage();
		cp.Proceed_To_Buy_Feature();
	}

	@Then("^Enter the User Information$")
	public void enter_the_User_Information(DataTable UserInfo) 
	{
		
		for(Map<String,String> data : UserInfo.asMaps(String.class, String.class))
		{
			cp = new CartPage();
			cp.User_Info_Feature(data.get("FullName"),data.get("Mobile No"),data.get("Pincode"), data.get("Flat No"), data.get("Area"), data.get("Landmark"));
		}
	}
	
	@Given("^Click on the the cart link from HomePage$")
	public void click_on_the_the_cart_link_from_HomePage()
	{
		hp = new HomePage();
		hp.Cart_Feature();
	}

	@Then("^Click on Delete link$")
	public void click_on_Delete_link()
	{
		cp = new CartPage();
		cp.Delete_Feature();
	}

	@Then("^Verify bag is deleted from the cart$")
	public void verify_bag_is_deleted_from_the_cart()
	{
		cp = new CartPage();
		cp.Delete_Verification_Feature();
	}
	
	@After
	
	public void teardown()
	{
		driver.quit();
	}
}

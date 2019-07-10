package com.orangehrm.steps;

import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.utils.CommonMethods;
import com.orangehrm.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends CommonMethods {

	LoginPage login;
	HomePage home;
	@Given("I logged in into OrangeHRM")
	public void i_logged_in_into_OrangeHRM() {
		login = new LoginPage();
		sendText(login.userName, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		
	}

	@Given("I am on Locations Page")
	public void i_am_on_Locations_Page() {
		home= new HomePage();
		click(home.admin);
	}

	@When("I provide locations name, country, city and zip code")
	public void i_provide_locations_name_country_city_and_zip_code() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("I location added successfully")
	public void i_location_added_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("I click on Add Locations")
	public void i_click_on_Add_Locations() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("I see following location labels")
	public void i_see_following_location_labels() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	
	
}
package com.orangehrm.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LanguagePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.SkillPage;
import com.orangehrm.utils.CommonMethods;
import com.orangehrm.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LanguageSteps extends CommonMethods{
	
	LoginPage login;
	HomePage home;
	LanguagePage language;
	
	@Given("I am on Languages Page")
	public void i_am_on_Languages_Page() {
		language=new LanguagePage();
		home = new HomePage();
		click(home.admin);
		click(home.qualifications);
		click(language.languages);
		
	}

	@When("I provide language name and click save")
	public void i_provide_language_name_and_click_save() throws InterruptedException {
		//language=new LanguagePage();
		Thread.sleep(3000);
		click(language.addLanguage);
		sendText(language.languageName, "Turkish");
		click(language.saveLanguage);
	}

	@Then("I see language is added successfully")
	public void i_see_language_is_added_successfully() {
		
		List<WebElement> languageList = driver.findElements(By.xpath("//*[@id=\"languagesDiv\"]/crud-panel/div/div/list/table/tbody/tr/td[2]"));
		for (WebElement webElement :languageList) {
			if (webElement.getText().trim().contains("Turkish")) {
				System.out.println("Language is succesfully added");
			}

		}

	}

}

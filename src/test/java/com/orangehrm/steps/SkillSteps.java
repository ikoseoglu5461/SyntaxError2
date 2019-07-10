package com.orangehrm.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.SkillPage;
import com.orangehrm.utils.CommonMethods;
import com.orangehrm.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SkillSteps extends CommonMethods {

	LoginPage login;
	HomePage home;
	SkillPage skill;

	@Given("I logged into OrangeHRM")
	public void i_logged_into_OrangeHRM() {
		login = new LoginPage();
		sendText(login.userName, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
	}

	@Given("I am on Skills Page")
	public void i_am_on_Skills_Page() {
		home = new HomePage();
		click(home.admin);
		click(home.qualifications);
		click(home.skills);
	}

	@When("I provide skills name and description")
	public void i_provide_skills_name_and_description() throws InterruptedException {
		skill=new SkillPage();
		Thread.sleep(3000);
		
		click(skill.addSkill);
		sendText(skill.skillName, "Creative");
		sendText(skill.skillDescription, "There is creative idea for any problem");
		click(skill.saveSkill);

	}

	@Then("I see skills are added successfully")
	public void i_see_skills_are_added_successfully() {

		List<WebElement> skillsList = driver
				.findElements(By.xpath("//*[@id=\"skillDiv\"]/crud-panel/div/div/list/table/tbody/tr/td[2]"));
		for (WebElement webElement : skillsList) {
			if (webElement.getText().trim().contains("Creative")) {
				System.out.println("Skill is succesfully added");
			}

		}

	}

}

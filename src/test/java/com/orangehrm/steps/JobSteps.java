package com.orangehrm.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.orangehrm.pages.JobPage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.SkillPage;
import com.orangehrm.utils.CommonMethods;
import com.orangehrm.utils.ConfigsReader;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JobSteps extends CommonMethods {
	
	LoginPage login;
	SkillPage skill;
	JobPage job;
	
//	@Given("I logged into OrangeHRM")
//	public void i_logged_into_OrangeHRM() {
//		login = new LoginPage();
//		sendText(login.userName, ConfigsReader.getProperty("username"));
//		sendText(login.password, ConfigsReader.getProperty("password"));
//		click(login.loginBtn);
//	}
	
	
	
	@And("I am on Job Titles Page")
	public void i_am_on_Job_Titles_Page() {
		job=new JobPage();
	    click(job.admin);
	    click(job.jobb);
	    click(job.jobTitle);	    
	}

	@When("I provide job title, description and upload file with job specifications")
	public void i_provide_job_title_description_and_upload_file_with_job_specifications() {
		job=new JobPage();
		click(job.AddJobTitle);
		sendText(job.AddJobTitleName, "Project Manager");
		sendText(job.AddJobTitleDescription, "Project Manager");
		sendText(job.AddJobSpecification, "C:\\Users\\ikoseoglu61\\Desktop\\Job.txt");
	    
	}

	@Then("I see job title is added successfully")
	public void i_see_job_title_is_added_successfully() {
	    
		List<WebElement> jobsList = driver.findElements(By.xpath("//*[@id=\"jobTitlesDiv\"]/crud-panel/div/div/list/table/tbody/tr/td[2]"));
		for (WebElement webElement : jobsList) {
			if (webElement.getText().trim().contains("Project Manager")) {
				System.out.println("Job Title is succesfully added");
			}

		}
	}
}

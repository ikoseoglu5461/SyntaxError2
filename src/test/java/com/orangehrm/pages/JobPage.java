package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utils.BaseClass;

public class JobPage extends BaseClass{
	
	
	@FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]/a/span[2]")
    public WebElement admin;
	
	@FindBy(xpath="//*[@id=\"menu_admin_Job\"]/a/span[2]")
	public WebElement jobb;

	@FindBy(xpath="//*[@id=\"menu_admin_viewJobTitleList\"]/span[2]")
	public WebElement jobTitle;
	
	@FindBy(xpath="//*[@id=\"jobTitlesDiv\"]/div/a/i")
	public WebElement AddJobTitle;
	
	@FindBy(xpath="//*[@id=\"jobTitleName\"]")
	public WebElement AddJobTitleName;
	
	@FindBy(xpath="//*[@id=\"jobDescription\"]")
	public WebElement AddJobTitleDescription;
	
	@FindBy(xpath="//*[@id=\"jobSpecification\"]")
	public WebElement AddJobSpecification;
	
	@FindBy(xpath="//*[@id=\"toast-container\"]/div/div")
	public WebElement checkJobTitle;
	
	
	public JobPage() {
		PageFactory.initElements(driver, this);
	}
	
	
}

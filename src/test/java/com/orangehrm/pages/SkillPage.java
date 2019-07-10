package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utils.BaseClass;

public class SkillPage extends BaseClass  {
	
//	@FindBy(xpath="//*[@id=\"menu_admin_Qualifications\"]/a/span[2]")
//	public WebElement organization;
//	
//	@FindBy(xpath="//*[@id=\"menu_admin_viewSkills\"]/span[2]")
//	public WebElement skills;
	
	@FindBy(xpath="//*[@id=\"skillDiv\"]/div")
	public WebElement addSkill;
	
	@FindBy(xpath="//*[@id=\"name\"]")
	public WebElement skillName;
	
	@FindBy(xpath="//*[@id=\"description\"]")
	public WebElement skillDescription;
	
	
	@FindBy(xpath="//*[@id=\"modal1\"]/form/div[2]/a[1]")
	public WebElement saveSkill;
	
	@FindBy(xpath="//*[@id=\"toast-container\"]/div/div")
	public WebElement checkSkill;
	
	public SkillPage() {
		PageFactory.initElements(driver, this);
	}
	
	

}

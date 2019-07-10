package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utils.BaseClass;

public class LanguagePage extends BaseClass{
	
	@FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]/a/span[2]")
    public WebElement admin;
	
    @FindBy(partialLinkText="Organization")
    public WebElement organization;
    
    @FindBy(xpath="//*[@id=\"menu_admin_viewLanguages\"]/span[2]")
    public WebElement languages;
    
    @FindBy(xpath="//*[@id=\"languagesDiv\"]/div/a/i")
	public WebElement addLanguage;
	
	@FindBy(xpath="//*[@id=\"name\"]")
	public WebElement languageName;
	
	@FindBy(xpath="//*[@id=\"modal1\"]/form/div[2]/a[1]")
	public WebElement saveLanguage;
	
	public LanguagePage() {
		PageFactory.initElements(driver, this);
	}

}

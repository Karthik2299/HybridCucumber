package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.Library;

public class AdminPage extends Library {
	
	@FindBy(id="menu_admin_viewAdminModule")
    WebElement admin_button;
    @FindBy(id="menu_admin_UserManagement")
    WebElement user_manage;
    @FindBy(id="menu_admin_viewSystemUsers")
    WebElement users;

    public AdminPage(Object driver) {
        this.driver=(WebDriver) driver;
        PageFactory.initElements((WebDriver) driver, this);

}

    public void apage() {
    	Actions action=new Actions(driver);
    	action.moveToElement(admin_button).perform();
    	action.moveToElement(user_manage).perform();
    	action.moveToElement(users).click().build().perform();
        

    }

}

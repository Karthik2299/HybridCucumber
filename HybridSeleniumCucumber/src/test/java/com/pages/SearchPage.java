package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.baseClass.Library;

public class SearchPage extends Library{

	@FindBy(id="searchSystemUser_userName")
    WebElement user_name;
    @FindBy(id="searchSystemUser_userType")
    WebElement user_type;
    @FindBy(id="searchSystemUser_employeeName_empName")
    WebElement Emp_name;
    @FindBy(id="searchSystemUser_status")
    WebElement status;
    @FindBy(id="searchBtn")
    WebElement search_button;
    

    public SearchPage(Object driver) {
        this.driver=(WebDriver) driver;
        PageFactory.initElements((WebDriver) driver, this);

}
    public void search(String uname,String EmpName) {
    	
    	user_name.sendKeys(uname);
    	Actions action=new Actions(driver);
    	Select user_role=new Select(user_type);
		user_role.selectByValue("Admin");
    	Emp_name.sendKeys(EmpName);
    	Select user_status=new Select(status);
		user_role.selectByValue("Enabled");
		search_button.click();
    	
    }
}

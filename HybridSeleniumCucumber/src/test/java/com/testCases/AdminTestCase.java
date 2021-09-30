package com.testCases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseClass.Library;
import com.pages.AdminPage;
import com.pages.LoginPage;
import com.seleniumReusableFunctions.SeleniumUtilities;

public class AdminTestCase extends Library {
	LoginPage lpage;
	AdminPage apage;
	SeleniumUtilities sUti;
	@BeforeTest
    public void stratUp() {
        launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");

    }
    @Test
    public void login() {
         lpage=new LoginPage(driver);
         lpage.login("Admin", "admin123");

    }
    @Test
    public void users() {
         apage=new AdminPage(driver);
         apage.apage();

    }
    @AfterClass
    public void close() throws IOException {
        sUti = new SeleniumUtilities(driver);
        sUti.to_take_screenshot("src\\test\\resources\\screenshots\\orangeHRMLogin.png");

        quit();

    }

}

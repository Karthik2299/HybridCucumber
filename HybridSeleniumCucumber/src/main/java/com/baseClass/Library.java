package com.baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//initialization code for your test cases will be written in this calss
//basic setup for launching an application
public class Library {
	protected WebDriver driver;
    public void launchApplication(String browser,String url) {
        try {
            if(browser.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();

            }else if(browser.equalsIgnoreCase("chrome")){
                WebDriverManager.chromedriver().setup();
                 driver=new ChromeDriver();

            }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get(url);

    }catch(WebDriverException e) {
        System.out.println("browser could not be launched");
        e.printStackTrace();
    }
        

    }
    public void quit() {
        driver.close();

    }
	
}

package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestGetBrowser{

    public WebDriver browser;
    @BeforeSuite

    public WebDriver setBrowser(){
        //open browser
        browser = new FirefoxDriver();
        browser.manage().window().maximize();
        return browser;

    }
    @AfterSuite
    public void quitBrowser(){
        browser.quit();
    }


}

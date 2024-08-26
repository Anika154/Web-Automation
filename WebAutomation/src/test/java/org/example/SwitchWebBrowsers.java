package org.example;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class SwitchWebBrowsers extends TestGetBrowser{
    @Test

    public void browser() throws InterruptedException {
        browser.get("https://www.youtube.com/");
        Thread.sleep(500);

        //Switching windows
        browser.switchTo().newWindow(WindowType.WINDOW);
        browser.get("https://www.google.com/");

        //get title
        System.out.println(browser.getTitle());

        //get current URL
        System.out.println(browser.getCurrentUrl());

        //Close window
        browser.close();
        Thread.sleep(5000);

        //Switching tabs
        browser.switchTo().newWindow(WindowType.TAB);
        browser.get("https://www.google.com/");

        //get title
        System.out.println(browser.getTitle());

        //get current URL
        System.out.println(browser.getCurrentUrl());

        //Close window
        browser.close();
        Thread.sleep(5000);

        //Quit browser
        browser.quit();

    }
}

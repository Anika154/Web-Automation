package org.example;

import org.testng.annotations.Test;

public class NavigateWebPages extends TestGetBrowser{
    @Test

    public void browser() throws InterruptedException {
        browser.get("https://www.youtube.com/");
        Thread.sleep(200);

        //navigate through web browser
        browser.navigate().to("https://www.google.com/");
        Thread.sleep(500);

        //navigate Back
        browser.navigate().back();
        Thread.sleep(4000);

        //navigate forward
        browser.navigate().forward();
        Thread.sleep(4000);

        //navigate refresh browser
        browser.navigate().refresh();
        Thread.sleep(4000);


    }

}

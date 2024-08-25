package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertBrowser extends TestGetBrowser{

    @Test
    public void loadBrowser() throws InterruptedException {
        //open browser
        //WebDriver browser = new ChromeDriver();


        //load browser
        //browser.get("https://www.youtube.com");

        //observe result

        Assert.assertEquals(browser.getTitle(),"YouTube");
        Assert.assertEquals(browser.getCurrentUrl(), "https://www.youtube.com/");
        //Thread.sleep(5000);


        //close browser
        //browser.close();


    }


}

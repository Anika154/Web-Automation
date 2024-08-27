package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitHandler extends TestGetBrowser {

    @Test
    public void TestWait(){
        browser.get("https://qavbox.github.io/demo/alerts/");
        browser.findElement(By.xpath("//input[@id='delayalert']")).click();

        //WebDriver Wait

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(100));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        alert.accept();

        //Implicity wait
        //browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Java wait = Thread.sleep();







    }
}

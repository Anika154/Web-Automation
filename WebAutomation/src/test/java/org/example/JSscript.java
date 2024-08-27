package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSscript extends TestGetBrowser {
    @Test

    public void script() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(500);

        JavascriptExecutor js = (JavascriptExecutor) browser;
        js.executeScript("window.scrollTo(document.body.scrollHeight,0)");

        WebElement mousehover = browser.findElement(By.xpath("//button[@id='mousehover']"));
        js.executeScript("arguments[0]. scrollIntoView();",mousehover);

        //browser.switchTo().frame(0);
        browser.switchTo().frame(browser.findElement(By.xpath("//iframe[@id='courses-iframe']")));
        WebElement course = browser.findElement(By.linkText("Courses"));
        System.out.println(course.getText());

        Thread.sleep(5000);
        browser.switchTo().defaultContent();
        WebElement iframeExampleText = browser.findElement(By.xpath("//legend[normalize-space()='iFrame Example']"));
        System.out.println(iframeExampleText.getText());
        Thread.sleep(4000);
        browser.quit();



    }
}

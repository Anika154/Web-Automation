package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionPerform extends TestGetBrowser {
    @Test

    public void actionTest() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement select = browser.findElement(By.xpath("//input[@id='autocomplete']"));
        Actions action = new Actions(browser);
        select.sendKeys("Anika");
        Thread.sleep(400);

        //select
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL). build().perform();
        Thread.sleep(400);

        //copy
        action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL). build().perform();

        //paste
        WebElement paste = browser.findElement(By.xpath("//input[@id='name']"));
        paste.sendKeys(Keys.CONTROL, "v");
        Thread.sleep(5000);

        //Scroll
        //action.scrollByAmount(0, 1200).build().perform();
        action.scrollToElement(browser.findElement(By.xpath("//button[@id='mousehover']"))).build().perform();


        Thread.sleep(5000);
        browser.quit();


    }
}

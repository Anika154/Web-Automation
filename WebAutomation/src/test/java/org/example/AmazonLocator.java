package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AmazonLocator extends TestGetBrowser{
    @Test
    public void Search() throws InterruptedException {

        browser.get("https://www.amazon.com");

        //ID Locator
//        WebElement searchfield = browser.findElement(By.id("twotabsearchtextbox"));
//        searchfield.sendKeys("Headsets");

        //Class Locator
//        WebElement searchfield = browser.findElement(By.className("nav-input nav-progressive-attribute"));
//        searchfield.sendKeys("Watch");

//        //Link Locator
//        WebElement link = browser.findElement(By.partialLinkText("Returns"));
//        System.out.println(link.getText());
//        link.click();

        //CSS Locator
//        WebElement copyRight = browser.findElement(By.cssSelector("div[class='navFooterLine navFooterLinkLine navFooterPadItemLine navFooterCopyright']"));
//        System.out.println(copyRight.getText());

        //Relatable xPath Locator
        //WebElement xPath = browser.findElement(By.xpath(""))
        WebElement xpath = browser.findElement(By.xpath("//a[@class='nav-a']"));

        System.out.println(xpath.getText());




        //searchfield.sendKeys("Watch");


        Thread.sleep(5000);
    }


}

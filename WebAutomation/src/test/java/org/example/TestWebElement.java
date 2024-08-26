package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestWebElement extends  TestGetBrowser{
    @Test

    public void rahulShetty() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        //navigate
        browser.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(500);

        //Get TagName
        WebElement tagName = browser.findElement(By.xpath( "//label[normalize-space()='Radio1']"));
        String tag = tagName.getTagName();
        System.out.println(tag);

        //GetCSS VALUE
        System.out.println(tagName.getCssValue("padding"));


        //Send keys
        browser.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Bangladesh");
        Thread.sleep(500);

        //Clear
        browser.findElement(By.xpath("//input[@id='autocomplete']")).clear();
        Thread.sleep(500);

        //Click
        browser.findElement(By.cssSelector("#checkBoxOption2")).click();
        Thread.sleep(500);

        //GetAttribute
        WebElement attribute = browser.findElement(By.xpath("//input[@id='checkBoxOption3']"));
        String attributeName = attribute.getAttribute("name");
        System.out.println(attributeName);

        //Is Displayed
        System.out.println("Display " + attribute.isDisplayed());

        //Is Selected
        System.out.println("Selected " + attribute.isSelected());

        //Is Enabled
        System.out.println("Enabled " + attribute.isEnabled());








    }

}

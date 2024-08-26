package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectHandler extends TestGetBrowser{
    @Test

    public void select() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(5000);

        WebElement dropdown = browser.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        dropdown.click();

        Select select = new Select(dropdown);
        select.selectByVisibleText("Option1");
        Thread.sleep(5000);

        select.selectByValue("option2");
        Thread.sleep(5000);

        select.selectByIndex(3);
        Thread.sleep(5000);

        System.out.println(select.getFirstSelectedOption().getText());
        browser.quit();





    }
}

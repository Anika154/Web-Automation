package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class extremeGadget extends TestGetBrowser{

    @Test
    public void AdvanceLocator() throws InterruptedException {

        browser.get("https://extremegadgets.com.bd");

        //Search
        browser.findElement(By.xpath("//form/input")).clear();
        browser.findElement(By.cssSelector("form > input")).sendKeys("Baseus Xundian 20000mAh Digital Display 22.5W Fast Charging Power Bank");
        Thread.sleep(5000);


        //Add to Cart
        WebElement element = browser.findElement(By.xpath("//button[@class='single_add_to_cart_button button alt']"));
        String cartText = element.getText();
        System.out.println(cartText);

        browser.findElement(By.cssSelector("[class*='single_add_to_cart_button button alt']")).click();
        Thread.sleep(500);

        //View Cart
        browser.findElement(By.linkText("VIEW CART")).click();
        Thread.sleep(5000);

        // Check the Price and subTotal
        String Price = browser.findElement(By.xpath("//tr/td[5]/preceding-sibling::td[1]")).getText(); //before current node
        String SubTotal = browser.findElement(By.xpath("//tr/td[5]/following-sibling::td[1]")).getText(); //after current node

        Assert.assertEquals(Price,"৳2,299.00");
        Assert.assertEquals(SubTotal,"৳2,299.00");

        Thread.sleep(500);


    }
}

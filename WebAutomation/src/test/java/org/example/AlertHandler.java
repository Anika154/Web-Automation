package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertHandler extends TestGetBrowser{
    @Test

    public void testAlert() throws InterruptedException {
        browser.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(5000);

        //Handling alerts and pop-ups
        browser.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Alert alert = browser.switchTo().alert(); //prompt
        Assert.assertEquals(alert.getText(),"I am a JS Alert");
        Thread.sleep(5000);

        alert.accept(); //confirmation

        String result = browser.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result,"You successfully clicked an alert");
        Thread.sleep(500);

        //Pompt Alert
        browser.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        alert = browser.switchTo().alert();
        Assert.assertEquals(alert.getText(),"I am a JS Confirm");
        Thread.sleep(3000);
        alert.accept();
        result = browser.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result,"You clicked: Ok");
        Thread.sleep(500);

        //Comfirmation alert
        browser.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        alert = browser.switchTo().alert();
        alert.sendKeys("Anika");
        Thread.sleep(2000);
        alert.accept();
        result = browser.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result,"You entered: Anika");
        Thread.sleep(3000);
        browser.quit();




    }

}

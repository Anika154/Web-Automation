package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BlockerAssertion {
    @Test

    public void testAssertion(){

        //Hard Assertion used for blocker
        //Assert.assertTrue(false);

        //Soft Assertions used for minor priority
        SoftAssert softAssert = new SoftAssert();

        System.out.println("welcome1");
        System.out.println("welcome2");
        System.out.println("welcome3");
        System.out.println("welcome4");
        softAssert.assertAll();
    }
}

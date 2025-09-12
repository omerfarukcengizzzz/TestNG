package com.demoqa.tests.forms;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFunctionalies extends BaseTest {

    @Test
    public void test(){
        Assert.assertTrue(homePage.isFormsCardDisplayed(), "Forms card is not displayed.");
        homePage.clickOnFormsCard();

        Assert.assertTrue(formsPage.isTextConfirmationDisplayed(), "Text confirmation is not displayed.");
    }

}

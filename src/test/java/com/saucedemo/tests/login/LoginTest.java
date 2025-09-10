package com.saucedemo.tests.login;

import com.saucedemo.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("asdf");
        loginPage.clickLoginButton();

        String actualErrorMessage = loginPage.getErrorMessage();

        Assert.assertFalse(actualErrorMessage.contains("Epic sadface"), "Login was unsuccessful.");
    }

}

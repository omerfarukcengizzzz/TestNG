package com.saucedemo.tests.products;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed() {
        ProductsPage productsPage = loginPage.login("standard_user", "secret_sauce");

        Assert.assertTrue(productsPage.isProducstHeaderDisplayed(), "Products header is not displayed.");
    }

}

package com.saucedemo.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage {

    private By productsHeader = By.xpath("//div[@class='product_label']");

    public Boolean isProducstHeaderDisplayed() {
        return find(productsHeader).isDisplayed();
    }
}

package com.saucedemo.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.xpath("//h3[@data-test='error']");

    public ProductsPage login(String username, String password) {
        set(this.username, username);
        set(this.password, password);
        click(this.loginButton);

        return new ProductsPage();
    }

    public String getErrorMessage() {
        return find(errorMessage).getText();
    }

}
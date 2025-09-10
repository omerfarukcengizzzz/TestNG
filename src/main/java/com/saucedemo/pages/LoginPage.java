package com.saucedemo.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.xpath("//h3[@data-test='error']");

    public void setUsername(String username) {
        set(this.username, username);
    }

    public void setPassword(String password) {
        set(this.password, password);
    }

    // transition methods
    public ProductsPage clickLoginButton() {
        click(this.loginButton);
        return new ProductsPage();
    }

    // convenience method
    public ProductsPage login(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    public String getErrorMessage() {
        return find(errorMessage).getText();
    }

}
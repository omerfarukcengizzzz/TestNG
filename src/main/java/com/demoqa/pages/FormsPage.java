package com.demoqa.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class FormsPage extends BasePage {

    public By textConfirmation = By.xpath("//*[contains(text(), 'Please select an item from')]");

    public boolean isTextConfirmationDisplayed() {
        return find(textConfirmation).isDisplayed();
    }

}
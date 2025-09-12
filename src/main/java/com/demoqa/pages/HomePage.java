package com.demoqa.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

import static com.utilities.JavaScriptUtils.*;

public class HomePage extends BasePage {

    private By formsCard = By.xpath("//div[@class='card-body']/h5[text()='Forms']");

    public Boolean isFormsCardDisplayed() {
        return find(formsCard).isDisplayed();
    }

    public FormsPage clickOnFormsCard(){
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

}
package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static com.base.BasePage.driver;

public class JavaScriptUtils extends Utils {

    public static void scrollToElementJS(By locator) {
        WebElement element = driver.findElement(locator);
        String jsScript = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(jsScript, element);
    }

    public static void clickOnElementJS(By locator) {
        WebElement element = driver.findElement(locator);
        String jsScript = "arguments[0].click();";
        ((JavascriptExecutor)driver).executeScript(jsScript, element);
    }

}

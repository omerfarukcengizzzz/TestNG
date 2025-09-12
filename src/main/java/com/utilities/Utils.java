package com.utilities;

import com.base.BasePage;
import org.openqa.selenium.WebDriver;

public class Utils {

    public static WebDriver webDriver;

    public static void setUtilityDriver() {
        webDriver = BasePage.driver;
    }

}

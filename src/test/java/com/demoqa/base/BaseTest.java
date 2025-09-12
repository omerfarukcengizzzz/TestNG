package com.demoqa.base;

import com.demoqa.pages.FormsPage;
import com.demoqa.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Arrays;

public class BaseTest {

    protected WebDriver driver;
    protected HomePage homePage;
    protected FormsPage formsPage;
    public SoftAssert softAssert = new SoftAssert();
    private final String baseUrl = "https://demoqa.com/#google_vignette";

    @BeforeClass
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-extensions");
        // For alert dialogs specifically
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(baseUrl);

        formsPage = new FormsPage();
        formsPage.setDriver(driver);

        homePage = new HomePage();
        homePage.setDriver(driver);
    }

    @AfterClass
    public void tearDown() {
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }

}
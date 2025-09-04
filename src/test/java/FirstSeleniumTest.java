import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

public class FirstSeleniumTest {

    protected WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://uniquename-trials7161.orangehrmlive.com/auth/login");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test(groups = "smoke")
    public void login() throws InterruptedException {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("OsQs@JlR66");

        var login = driver.findElement(By.tagName("button"));
        login.click();


        Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Employee Management']")).getText(), "Employee Management", "Login was unsuccessful.");
    }

    @AfterMethod
    public void screenshotForFailures(ITestResult testResult) {

        if (ITestResult.FAILURE == testResult.getStatus()){
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File(System.getProperty("user.dir") + "/resources/screenshots" + testResult.getName() + ".png");
            try {
                Files.copy(source.toPath(), destination.toPath());
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

    }

}
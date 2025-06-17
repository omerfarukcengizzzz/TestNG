import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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

    @Test
    public void login() throws InterruptedException {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("OsQs@JlR66");

        var login = driver.findElement(By.tagName("button"));
        login.click();


        Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Employee Management']")).getText(), "Employee Management", "Login was unsuccessful.");
    }

}
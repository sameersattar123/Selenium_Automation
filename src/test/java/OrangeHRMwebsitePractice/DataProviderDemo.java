package OrangeHRMwebsitePractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// Parameterization

public class DataProviderDemo {
    WebDriver driver;

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(dataProvider = "dp")
    void login(String email, String Password) throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Thread.sleep(2000);

    }

    @AfterClass
    void close() {
        driver.quit();
    }

    @DataProvider(name = "dp")
    Object[][] loginData() {
        Object[][] data = {
                { "Admin", "admin12" },
                { "Admi", "admin123" },
                { "Admi", "dmin123" },
                { "Admn", "amin123" },
                { "Admin", "admin123" },
        };
        return data;
    }
}

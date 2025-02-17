package OrangeHRMwebsitePractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// parallel testing using xml file
// ----------------

// step1) created test case
// step 2) create xml file then run test case through xml
// step3 ) passed browser name, url as parameters from xml file to setup() method
// step4 ) execute test case on chrome,firefox & Edge (serial execution)
// step4 ) execute test case on chrome,firefox & Edge (parallel execution)

// In xml file 
// <parameter name="browser" value="chrome"></parameter>
// <parameter name="browser" value="firefox"></parameter>
// <parameter name="browser" value="edge"></parameter>

public class ParamTest {
    WebDriver driver;

    @BeforeClass
    @Parameters({"browser"})
    void setup(String br) throws InterruptedException {
        if (br == "chrome") {
            driver = new ChromeDriver();
        } else if (br == "firefox") {
            driver = new FirefoxDriver();
        } else if (br == "edge") {
            driver = new EdgeDriver();
        } else {
            System.out.println("Invalid browser name. Please choose between Chrome, Firefox or Edge");
            return;
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

    @Test(priority = 1)
    void testLogo() {
        boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertEquals(status, true);
    }

    @Test(priority = 2)
    void testUrl() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 3)
    void testTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM");
    }

    @AfterClass
    void close() {
        driver.quit();
    }
}

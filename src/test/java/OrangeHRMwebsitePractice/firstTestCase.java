package OrangeHRMwebsitePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class firstTestCase {
    WebDriver driver;

    @Test(priority = 1)
    void openApp() {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test(priority = 2)
    void checkLogo() throws InterruptedException {
            Thread.sleep(3000);
            boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
            if (logo) {
                System.out.println("Logo Present");
            } else {
                System.out.println("Logo not present");
            }
    }

    @Test(priority = 3)
    void login() {
            driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }

    @Test(priority = 4)
    void logout() {
            driver.quit();
    }
}

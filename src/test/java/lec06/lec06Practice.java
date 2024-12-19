package lec06;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// wait commands
// 1) Implicit 
// 2) explicit wait ==> fluent command

public class lec06Practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait myWait = new WebDriverWait(driver , Duration.ofSeconds(10)); // drclaration for emplicits

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000)); // implicit wait ==> it will not wait till maximum time if the element is available

        driver.get("https://outschool.com/");
        driver.manage().window().maximize();

        // Thread.sleep(5000);  // pause the execution , it wait until the time is over 

        // explicit use 
        WebElement searchBar = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='downshift-0-input']")));

        searchBar.sendKeys("sameer");

        
    }
}

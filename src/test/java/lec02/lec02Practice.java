package lec02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// locators 
// 1) id
// 2) name
// 3) linkText
// 4) partialLinkText
// 5) tag
// 6) className

public class lec02Practice {
    public static void main(String[] args) {

        // step (1) : launch the browser (chrome)
        // ChromeDriver driver = new ChromeDriver(); ==> Approach 01
        WebDriver driver = new ChromeDriver(); // ===> Approah 02
        driver.get("https://outschool.com/");
        driver.manage().window().maximize(); // for full screen

        // locators : id
        driver.findElement(By.id("downshift-0-input")).sendKeys("English");

        boolean searchBarDisplayedStatus = driver.findElement(By.id("downshift-0-input")).isDisplayed();
        if (searchBarDisplayedStatus) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        // locators : linkText

        driver.findElement(By.linkText("Log In")).click();

        // Locator : PartialLinkText
        driver.findElement(By.partialLinkText("Log")).click(); // for unique link name , we use partiallinkText

        // locator : tagName
        List<WebElement> footerLinks = driver.findElements(By.tagName("a"));
        System.out.println(footerLinks.size()); // 108

    }
}

package lec09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// Headless Testing 
// ===> advantages 
    // 1. Reduce load on the system
    // 2. Increase efficiency in testing (faster)
    // 3. we can do multiple tasks 
// ====> disadvantages 
    // 1. Not all features are available in headless mode
    // 2. Debugging is harder in headless mode
    // 3. Some websites may not support headless mode


public class HeadlessTestingPractice {
    public static void main(String[] args) {

        ChromeOptions opts = new ChromeOptions();
        opts.addArguments("--headless=new");
        WebDriver driver = new ChromeDriver(opts); // setting for headless mode of execution

        // step (2) : Open the website URL
        driver.get("https://outschool.com/");

        String actualTitle = driver.getTitle();

        if (actualTitle.equals("Get affordable online classes and tutoring for kids at Outschool")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }

}

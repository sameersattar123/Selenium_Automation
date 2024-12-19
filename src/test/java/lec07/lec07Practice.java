package lec07;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Naviagtion Methods
// navigate.to()
// navigate.back()
// navigate.forward()
// navigate.refresh()

public class lec07Practice {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new ChromeDriver();
        // driver.get("https://outschool.com/");
        // driver.manage().window().maximize();

        // URL myUrl = new URL("https://outschool.com/");
        // driver.navigate().to(myUrl);

        driver.navigate().to("https://outschool.com/"); // same work as get method but we can also pass URL
        driver.navigate().to("https://outschool.com/users/login"); // same work as get method but we can also pass URL

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl()); // https://outschool.com/

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl()); // https://outschool.com/users/login

        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl()); // https://outschool.com/users/login


    }
}

package lec04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// XPath
// XPath is an address of element
// DOM - DOCUMENT OBJECT MODEL

// There are two types of XPath
// Absolute XPath(Full XPath) ====> /html/body/div[1]/main/div/div[1]/div/div/div/div/div[1]/div/form/div/input 
// Relative XPath(Partial XPath) =======> *[@id="downshift-0-input"]

// Relative XPath is very easy as compared to Absolute XPath that's we use Relative XPath 
// There are 2 types of Relative XPath 
// 1) Automatically ( using inspects tools)
// 2) Manually ( using general syntax)

// Syntax to write manually relative xpath 
//  Syntax ==> //tagname[@attribute='value'] or //*[@attribute='value']

public class lec04Practice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://outschool.com/");
        driver.manage().window().maximize();

        // XPath with single attribute
        driver.findElement(By.xpath("//input[@id='downshift-0-input']")).sendKeys("urdu");
        driver.findElement(By.xpath("//*[@id='downshift-0-input']")).sendKeys("urdu");

        // XPath with multiple attributes using and key words
        driver.findElement(By.xpath("//input[@type='text' and @id='downshift-0-input']")).sendKeys("urdu");
        driver.findElement(By.xpath("//*[@type='' and @id='downshift-0-input']")).sendKeys("urdu");

        // XPath with multiple attributes using or key words
        driver.findElement(By.xpath("//input[@type='text' or @id='downshift-0-input']")).sendKeys("urdu");
        driver.findElement(By.xpath("//*[@type='' or @id='downshift-0-input']")).sendKeys("urdu");

        // XPath with multiple attributes
        driver.findElement(By.xpath("//input[@type='text'][@id='downshift-0-input']")).sendKeys("urdu");
        driver.findElement(By.xpath("//*[@type='text'][@id='downshift-0-input']")).sendKeys("urdu");

        // XPath with inner text using text()
         driver.findElement(By.xpath("//*[text()='Get Started']")).click();

        boolean textDisplayedStatus =
        driver.findElement(By.xpath("//*[text()='Join']")).isDisplayed();
        if (textDisplayedStatus) {
        System.out.println("Test Passed");
        } else {
        System.out.println("Test Failed");
        }

        String getbtnText =
        driver.findElement(By.xpath("//*[text()='Join']")).getText();
        System.out.println(getbtnText);

        // XPath with Contain
        driver.findElement(By.xpath("//input[contains(@placeholder , 'Search online classes and tutors')]")).sendKeys("organic chemistry");

        // XPath with starts-with
        driver.findElement(By.xpath("//input[starts-with(@placeholder ,'Search')]")).sendKeys("chemistry");

        // Chained XPath ( combination of absolute and relative XPath)
        boolean isLogoDisplayed = driver.findElement(By.xpath("//div[@class='css-15r8ub5']/div/div/div/span"))
                .isDisplayed();
        System.out.println(isLogoDisplayed);

    }

}

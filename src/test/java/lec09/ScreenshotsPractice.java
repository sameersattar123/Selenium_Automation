package lec09;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotsPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // capture the entire page screenshot

        TakesScreenshot ts = (TakesScreenshot) driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(System.getProperty("user.dir") + "\\screenshots\\Homepage.png");
        sourceFile.renameTo(destinationFile);

        // capture the screenshot of specific part 

        WebElement featureProduct = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
        File sourceFile2 = featureProduct.getScreenshotAs(OutputType.FILE);
        File destinationFile2 = new File(System.getProperty("user.dir") + "\\screenshots\\featureProduct.png");
        sourceFile2.renameTo(destinationFile2);

        // capture the screenshot of specific webelement 

        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File sourceFile3 = logo.getScreenshotAs(OutputType.FILE);
        File destinationFile3 = new File(System.getProperty("user.dir") + "\\screenshots\\logo.png");
        sourceFile3.renameTo(destinationFile3);


    }
}

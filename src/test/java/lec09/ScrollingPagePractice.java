package lec09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPagePractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // scroll down the page using the pixel number
        js.executeScript("window.scrollBy(0,2000)", "");
        System.out.println(js.executeScript("return window.pageYOffset;")); // vertically
        // System.out.println(js.executeScript("return window.pageXOffset;")); // horizontally

        // scroll the page till the element is visible
        WebElement ele = driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
        js.executeScript("arguments[0].scrollIntoView()", ele);
        System.out.println(js.executeScript("return window.pageYOffset;"));

        // scroll the page till the page is end
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); // vertically
        // js.executeScript("window.scrollBy(0,document.body.scrollWidth)"); // horizontally
        System.out.println(js.executeScript("return window.pageYOffset;"));

        Thread.sleep(5000);

        // scroll the page back to the top
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));

    }
}
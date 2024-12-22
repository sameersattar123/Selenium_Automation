package lec09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        List<WebElement> totalNoPaginations = driver.findElements(By.xpath("//ul[@id='pagination']/li"));
        System.out.println(totalNoPaginations.size()); // 4

        for (int i = 1; i <= totalNoPaginations.size(); i++) {
           for (int j = 1; j <= 5; j++) {
            String name = driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[" + j + "]/td[2]"))
            .getText();
            String price = driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[" + j + "]/td[3]"))
            .getText();
            System.out.println(name + "\t" + price);
        }
            if (i > 1) {
            WebElement activePage =
            driver.findElement(By.xpath("//ul[@id='pagination']/li["+i+"]"));
            activePage.click();
            }
        }

    }
}

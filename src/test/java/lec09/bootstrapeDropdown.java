package lec09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrapeDropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[contains(@class ,'multiselect')]")).click();

        // select any one option
        driver.findElement(By.xpath("//input[@value='Oracle']")).click();

        // capture all options and total size
        List<WebElement> allOptions = driver.findElements(By.xpath("//ul[contains(@class , 'multiselect')]//label"));
        System.out.println(allOptions.size());

        for (int index = 0; index < allOptions.size(); index++) {
            allOptions.get(index).getText();
        }

    }
}

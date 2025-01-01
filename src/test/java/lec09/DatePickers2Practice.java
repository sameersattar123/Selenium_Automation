package lec09;

import java.time.Month;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickers2Practice {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='txtDate']")).click();
        WebElement selectYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select = new Select(selectYear);
        select.selectByVisibleText("2021");

        WebElement selectMonth =  driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select2 = new Select(selectMonth);
        select2.selectByVisibleText("May");



    }
}

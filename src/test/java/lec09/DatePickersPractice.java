package lec09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickersPractice {
    static void selectFutureDate(WebDriver driver , String year , String month , String date){
        while (true) {
            String actualMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String actualYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if (actualMonth.equals(month) && actualYear.equals(year)) {
                break;
            }

            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // Next Button
        }

        List<WebElement> allDates =  driver.findElements(By.xpath("//table//tbody/tr/td/a"));

        for (WebElement actualDate : allDates) {
            if(actualDate.getText().equals(date)){
                actualDate.click();
                break;
            }
        }
    }
    static void selectPastDate(WebDriver driver , String year , String month , String date){
        while (true) {
            String actualMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String actualYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if (actualMonth.equals(month) && actualYear.equals(year)) {
                break;
            }

            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // Next Button
        }

        List<WebElement> allDates =  driver.findElements(By.xpath("//table//tbody/tr/td/a"));

        for (WebElement actualDate : allDates) {
            if(actualDate.getText().equals(date)){
                actualDate.click();
                break;
            }
        }
    }
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        driver.switchTo().frame(0);

        // using sendkeys
        // driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/03/2024");

        // using data pickers
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        // String month = "May";
        // String year = "2026";
        // String date = "23";

        // selectFutureDate(driver, year, month, date);

        String month = "May";
        String year = "2021";
        String date = "23";

        selectPastDate(driver, year, month, date);
        

    }
}

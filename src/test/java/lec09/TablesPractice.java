package lec09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // Static Web Tables
        // calculate numbers of rows
        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        System.out.println(tableRows.size()); // 7

        // calculate numbers of columns
        List<WebElement> tableColumns = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th"));
        System.out.println(tableColumns.size()); // 4

        String tableText1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[1]")).getText();
        System.out.println(tableText1); // Learn Selenium

        String tableText2 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[1]")).getText();
        System.out.println(tableText2); // Learn Java

        String tableText3 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]")).getText();
        System.out.println(tableText3); // Master In JS

        String tableText4 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[4]")).getText();
        System.out.println(tableText4); // 300

        // read data from table
        for (int i = 2; i <= tableRows.size(); i++) {
            for (int j = 1; j <= tableColumns.size(); j++) {
                System.out
                        .print(driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[" + j + "]"))
                                .getText() + "\t");
            }
            System.out.println();
        }

        // read data from row 2 and column 2
        for (int i = 2; i <= tableRows.size(); i++) {
            String authorsNames = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[2]"))
                    .getText();
            if (authorsNames.equals("Mukesh")) {
                System.out.println(
                        driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[1]")).getText());
            }
        }

        // find total price of table
        int totalPrice = 0;
        for (int i = 2; i <= tableRows.size(); i++) {
            String prices = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[4]")).getText();
            totalPrice += Integer.parseInt(prices);
        }
        System.out.println(totalPrice);

    }
}

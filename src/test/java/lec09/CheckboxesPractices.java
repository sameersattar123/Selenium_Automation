package lec09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesPractices {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // Select All the Checkboxes
        List<WebElement> checkBoxes = driver
                .findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

        // Approach 01
        for (int i = 0; i < checkBoxes.size(); i++) {
            checkBoxes.get(i).click();
        }

        // Approach 02
        for (WebElement checkBox : checkBoxes) {
        checkBox.click();
        }

        // Select last 3 checkboxes
        for (int i = 4; i < checkBoxes.size(); i++) {
            checkBoxes.get(i).click();
        }
        
        // select start 3 checkboxes
        for (int i = 0; i < checkBoxes.size(); i++) {
            checkBoxes.get(i).click();
            if(i == 2) break; // break after 3 clicks
        }

        // select only one checkboxe
        driver.findElement(By.xpath("//input[@id='sunday']")).click();;

        // Unselect those whose already selected 
          for (int i = 0; i < checkBoxes.size(); i++) {
            checkBoxes.get(i).click();
            if(i == 2) break; // break after 3 clicks
        }
        for (WebElement checkBox : checkBoxes) {
            if (checkBox.isSelected()) {
                checkBox.click();
            }
        }
    }
}

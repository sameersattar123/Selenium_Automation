package lec09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.implementation.Implementation;

public class dropDownPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement drpElement = driver.findElement(By.xpath("//select[@id='country']"));
        Select selectOpt = new Select(drpElement);

        // select method to select any option by visisbleText
        // selectOpt.selectByVisibleText("Japan");

        // selectByIndex method to select any option by its index
        // selectOpt.selectByIndex(2);

        // selectByValue method to select any option by its value
        // selectOpt.selectByValue("japan");

        List<WebElement> selectAllOptions = selectOpt.getOptions();

        // print the number of options
        System.out.println(selectAllOptions.size());

        // print the number of options and their text
        for (int i = 0; i < selectAllOptions.size(); i++) {
            System.out.println(selectAllOptions.get(i).getText());
        }

        

    }
}

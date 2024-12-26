package lec09;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
       // driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI");
       // driver.get("https://www.text-compare.com");
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // drag and drop using getLocation method
        Actions act = new Actions(driver);

        // Min Slider 
        
        // WebElement min_slider = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
        // System.out.println(min_slider.getLocation()); // (59,289)
        // act.dragAndDropBy(min_slider, 100, 289).perform();;
        // System.out.println(min_slider.getLocation().getY()); // 289
        // System.out.println(min_slider.getLocation().getX()); // 161
        // System.out.println(min_slider.getLocation()); // (161 , 289)
        
        // Max Slider
        // WebElement max_slider = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
        // System.out.println(max_slider.getLocation()); // (544,289)
        // act.dragAndDropBy(max_slider, -100, 289).perform();;
        // System.out.println(max_slider.getLocation().getY()); // 289
        // System.out.println(max_slider.getLocation().getX()); // 442
        // System.out.println(max_slider.getLocation()); //(442,289)

        // keyboard Actions using Action method 

        // driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Sameer Sattar");

        // // select the text 
        // act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

        // // copy the text
        // act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

        // // tab 
        // act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

        // // paste the copied text
        // act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();


        WebElement registerPage =  driver.findElement(By.xpath("//a[@class='ico-register']"));
        act.keyDown(Keys.CONTROL).click(registerPage).keyUp(Keys.CONTROL).perform();

        List<String> ids = new ArrayList(driver.getWindowHandles());

        driver.switchTo().window(ids.get(1));
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("args");;
        
        driver.switchTo().window(ids.get(0));
        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Sattar");


    }
}

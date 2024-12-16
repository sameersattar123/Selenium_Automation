package lec03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Css Selectors
// 1) tag id ===> tag#id
// 2) tag class ===> tag.classname
// 3) tag attribute ===> tag[attribute = 'value']
// 4) tag class attribute ====> tag.classname[ attribute= 'value']

public class lec03Practice {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://outschool.com/");
        driver.manage().window().maximize();

        // 1) tag id ===> tag.id
        driver.findElement(By.cssSelector("input#downshift-0-input")).sendKeys("chemistry");  // Approach 01
        driver.findElement(By.cssSelector("#downshift-0-input")).sendKeys("physics");  // Approach 02

        // 2) tag attribute ===> tag[attribute = 'value']
        driver.findElement(By.cssSelector("input[placeholder='Search online classes and tutors']")).sendKeys("chemistry");  // Approach 01
        driver.findElement(By.cssSelector("[placeholder='Search online classes and tutors']")).sendKeys("physics");  // Approach 02

        // 3) tag class attribute ====> tag.classname[attribute= 'value']
        driver.findElement(By.cssSelector("input#downshift-0-input[placeholder='Search online classes and tutors']")).sendKeys("chemistry");  // Approach 01
        driver.findElement(By.cssSelector("#downshift-0-input[placeholder='Search online classes and tutors']")).sendKeys("physics");  // Approach 02
    
        // 4) tag class  ====> tag.classname
        driver.findElement(By.cssSelector("input.MuiInputBase-input.MuiInput-input.MuiInputBase-inputSizeSmall.css-94m5oa")).sendKeys("chemistry");  // Approach 01
        driver.findElement(By.cssSelector(".MuiInputBase-input.MuiInput-input.MuiInputBase-inputSizeSmall.css-94m5oa")).sendKeys("physics");  // Approach 02
    }
}

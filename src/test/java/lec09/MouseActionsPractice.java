package lec09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// Mover Hover ==> moveToElement()
// right Click  ===> 
// Double Click ===> 
// Drag and Drop ===> 

// build() ==> create an action
// perform() ==> performe the action

public class MouseActionsPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // driver.get("https://demo.opencart.com/");
        // driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        // driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html");
        driver.manage().window().maximize();

        WebElement desktop =
        driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
        WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

        // Mouse Hover
        Actions act = new Actions(driver);
        act.moveToElement(desktop).moveToElement(mac).click().build().perform();
        act.moveToElement(desktop).moveToElement(mac).click().perform();

        // Right Click
        WebElement rightClickElement =
        driver.findElement(By.xpath("//span[@class='context-menu-one btnbtn-neutral']"));
        act.contextClick(rightClickElement).perform();

        driver.findElement(By.xpath("//span[normalize-space()='Paste']")).click();

        Thread.sleep(5000);
        driver.switchTo().alert().accept();

        // Double Click
        driver.switchTo().frame("iframeResult");
        WebElement inputBox1 = driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement inputBox2 = driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement btn = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

        inputBox1.clear();
        inputBox1.sendKeys("Sameer Sattar");
        //Actions act = new Actions(driver);
        act.doubleClick(btn).perform();

        String value1 = inputBox2.getAttribute("value");
        System.out.println(value1);

        if(value1.equals("Sameer Sattar")){
        System.out.println("Test Passed");
        } else {
        System.out.println("Test Failed");
        }

        // drag and drop
        WebElement sourceElement = driver.findElement(By.xpath("//div[@id='dropContent']//div[@id='box3']"));
        WebElement targetElement = driver.findElement(By.xpath("//div[@id='box103']"));
        // Actions act = new Actions(driver);
        act.dragAndDrop(sourceElement, targetElement).perform();

    }
}

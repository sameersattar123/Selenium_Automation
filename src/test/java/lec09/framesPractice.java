package lec09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesPractice {
    public static void main(String[] args) {
         WebDriver driver = new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();


       // Switch to the first frame
       WebElement frame1 =  driver.findElement(By.xpath("//frame[@src='frame_1.html']"));

        driver.switchTo().frame(frame1);
        
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("sameer");
        
        // default page 
        driver.switchTo().defaultContent();

        //switch to the second frame
        WebElement frame2 =  driver.findElement(By.xpath("//frame[@src='frame_2.html']"));

        driver.switchTo().frame(frame2);
        
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("sameer");

        // default page
        driver.switchTo().defaultContent();
        
        // switch to the third frame
        WebElement frame3 =  driver.findElement(By.xpath("//frame[@src='frame_3.html']"));

        driver.switchTo().frame(frame3);
        
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("sameer");

        driver.switchTo().frame(0);

        driver.findElement(By.xpath("//div[@id='i12']//div[@class='AB7Lab Id5V1']")).click();
        driver.findElement(By.xpath("//div[@id='i27']//div[@class='uHMk6b fsHoPb']")).click();

        // default page
        driver.switchTo().defaultContent();
        
        // switch to the fourth frame
        WebElement frame4 =  driver.findElement(By.xpath("//frame[@src='frame_4.html']"));

        driver.switchTo().frame(frame4);
        
        driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("sameer");


    }
}

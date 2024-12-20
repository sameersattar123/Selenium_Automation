package lec09;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndPopupsPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // close alert using OK button
        driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
        Thread.sleep(10000);
        Alert myAlert = driver.switchTo().alert();
        System.out.println(myAlert.getText());
        myAlert.accept();

        // close alert using Cancel button
        driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
        Thread.sleep(5000);
        Alert myAlert2 = driver.switchTo().alert();
        System.out.println(myAlert2.getText());
        myAlert2.dismiss();
        
        //  close the alert with input then press OK button
        driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
        Alert myAlert3 = driver.switchTo().alert();
        myAlert3.sendKeys("sameer");
        Thread.sleep(5000);
        myAlert3.accept();

    }
}

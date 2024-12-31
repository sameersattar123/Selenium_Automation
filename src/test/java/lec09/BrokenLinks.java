package lec09;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();

        List<WebElement> links = driver.findElements(By.tagName("a"));

        int  noOfBrokenLinks = 0;
        for (WebElement linkElement : links) {
            String hrefValue = linkElement.getAttribute("href");
            if (hrefValue == null || hrefValue.isEmpty()) {
                System.out.println("Not Possible");
                continue;
            }

           try {
             URL linkURL = new URL(hrefValue); // convert href value from string to url
             HttpURLConnection connection = (HttpURLConnection) linkURL.openConnection(); // open connection to the server
             connection.connect(); // try to establish connection
 
             if (connection.getResponseCode() >= 400) {
                 System.out.println(linkURL + " =====> Broken Link");
                 noOfBrokenLinks++; // increment the count of broken links
             } else {
                 System.out.println("Not a Broken Link");
             }
           } catch (Exception e) {
             System.out.println("Error Occurred: " + e.getMessage());
             continue; // skip this link if it couldn't be checked due to an error
           }
        }
        System.out.println("Total number of broken links: " + noOfBrokenLinks);
    }
}

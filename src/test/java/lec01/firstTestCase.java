package lec01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


// Test Case 01
// step (1) :  launch the browser (chrome)
// step (2) :  Open the website URL 
// step (3) :  Verify the title of the page
// step (4) : close the browser

public class firstTestCase {
    public static void main(String[] args) {

        // step (1) :  launch the browser (chrome)
        // ChromeDriver driver = new ChromeDriver();  ==> Approach 01 
        WebDriver driver = new ChromeDriver();  // ===> Approah 02

        // step (2) :  Open the website URL 
        driver.get("https://outschool.com/");

        // step (3) :  Verify the title of the page
        String actualTitle = driver.getTitle();

        if(actualTitle.equals("Get affordable online classes and tutoring for kids at Outschool")){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        // step (4) : close the browser
       driver.close();
        

    }
}

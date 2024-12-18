package lec05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Selenium Methods
// 1) get Methods 
// 2) conditional methods
// 3) browers methods ( quit() , close())


public class lec05Practice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://outschool.com/");
        driver.manage().window().maximize();

        // Get the title of the webpage and print it
        System.out.println(driver.getTitle()); // Log In | Outschool

        // get the source code of this page
        System.out.println(driver.getPageSource()); // give the soure code of particular page

        // get the ID of particular page
        System.out.println(driver.getWindowHandle()); // FE0BA6F3A4D4DE9F4EA69D3855122B58 // it change very time

        // get the URL of current page
        System.out.println(driver.getCurrentUrl()); // https://outschool.com/users/login

        // driver.findElement(By.linkText("Privacy Policy")).click();
        // Set<String> pageIds = driver.getWindowHandles(); // it give multiple page ids
        // System.out.println(pageIds);

        WebElement schoolImg = driver.findElement(By.xpath("//img[@alt='Outschool courses']"));

        // check if school image is displayed on the home page
        System.out.println("School Image is display on the home page: " + schoolImg.isDisplayed());

        boolean searchFunctionality = driver.findElement(By.xpath("//input[@id='downshift-0-input']")).isEnabled();
       
        // check if search functionality is enabled on the home page
        System.out.println("Search functionality is enabled on the home page: " + searchFunctionality);


    }
}

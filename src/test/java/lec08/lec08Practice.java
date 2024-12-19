package lec08;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class lec08Practice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://outschool.com/users/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//img[@alt='Download on the App Store']")).click();

        Set<String> outSchoolIds = driver.getWindowHandles();

        // Approach 01
        // List<String> outSchoolList = new ArrayList<>(outSchoolIds);
        // String parentPageId = outSchoolList.get(0);
        // String childPageId = outSchoolList.get(1);

        // System.out.println(parentPageId);
        // System.out.println(childPageId);

        // System.out.println(driver.getTitle());

        // driver.switchTo().window(childPageId);
        // System.out.println(driver.getTitle());

        // driver.switchTo().window(parentPageId);
        // System.out.println(driver.getTitle());

        // Approach 02
        for (String outSchId : outSchoolIds) {
            String title = driver.switchTo().window(outSchId).getTitle();
            System.out.println(title);
        }
    }
}

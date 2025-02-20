package OrangeHRMwebsitePractice.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// POM has 2 approches 
    // 1. without Page Factory (Most common) ========> used in this login page 
    // 2. By Page Factory (Recomended) 

public class LoginPage {

    // constructor
    WebDriver driver;
    LoginPage(WebDriver driver){
        this.driver = driver;
    }

    // locators
    By usernameLoc = By.xpath("//input[@placeholder='Username']");
    By passwordLoc = By.xpath("//input[@placeholder='Password']");
    By loginBtnLoc = By.xpath("//button[normalize-space()='Login']");

    // Actions and Methods
    public void setUsername(String user){
        driver.findElement(usernameLoc).sendKeys(user);
    }
    public void setPassword(String password){
        driver.findElement(passwordLoc).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(loginBtnLoc).click();
    }
}

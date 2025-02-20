package OrangeHRMwebsitePractice.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

// POM has 2 approches 
    // 1. without Page Factory (Most common)
    // 2. By Page Factory (Recomended) ========> used in this login page 

public class LoginPage2 {
    WebDriver driver;

    LoginPage2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // MANDATORY
    }

    // locators
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement usernameLoc;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordLoc;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginBtn;

    // Another way to write XPATH in page factory form 
    // @FindBy(how=How.XPATH , using = "//input[@placeholder='Username']")
    // @FindBy(how=How.XPATH , using = "//input[@placeholder='Password']")
    // @FindBy(how=How.XPATH , using = "//button[normalize-space()='Login']")

    // Actions and Methods
    public void setUsername(String user) {
        usernameLoc.sendKeys(user);
    }

    public void setPassword(String password) {
        passwordLoc.sendKeys(password);
    }

    public void clickLogin() {
        loginBtn.click();
    }
}

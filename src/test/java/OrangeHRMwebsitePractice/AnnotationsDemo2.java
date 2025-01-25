package OrangeHRMwebsitePractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// TC2
// 1) login ==> @BeforeClass
// 2) search ==> @Test (priority = 1)
// 3) advSearch ==> @Test (priority = 2)
// 4) logout ===> @AfterClass

public class AnnotationsDemo2 {
    @BeforeClass
    void login() {
        System.out.println("Login method is called");
    }

    @Test(priority = 1)
    void search() {
        System.out.println("Search method is called");
    }

    @Test(priority = 2)
    void advSearch() {
        System.out.println("Advanced Search method is called");
    }

    @AfterClass
    void logout() {
        System.out.println("Logout method is called");
    }
}

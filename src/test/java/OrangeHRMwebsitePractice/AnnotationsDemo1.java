package OrangeHRMwebsitePractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// TC1 
// 1) login ==> @BeforeMethod
// 2) search ==> @Test (priority = 1)
// 3) logout ===> @AfterMethod
// 4) login ==> @BeforeMethod
// 5) advSearch ==> @Test (priority = 2)
// 6) logout ===> @AfterMethod

public class AnnotationsDemo1 {
    @BeforeMethod
    void login(){
        System.out.println("Login method is called");
    }

    @Test (priority = 1)
    void search(){
        System.out.println("Search method is called");
    }

    @Test (priority = 2)
    void advSearch(){
        System.out.println("Advanced Search method is called");
    }

    @AfterMethod
    void logout(){
        System.out.println("Logout method is called");
    }
}

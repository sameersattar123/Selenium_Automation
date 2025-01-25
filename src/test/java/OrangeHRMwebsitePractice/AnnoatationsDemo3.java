package OrangeHRMwebsitePractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnoatationsDemo3 {
    @BeforeSuite
    void BeforeSuiteTest(){
        System.out.println("Before Suite Test");
    }
    @BeforeTest
    void BeforeTest(){
        System.out.println("Before Test");
    }
    @BeforeClass
    void beforeClassTest(){
        System.out.println("Before Class Test");
    }
    @BeforeMethod
    void beforeMethodTest(){
        System.out.println("Before Method Test");
    }

    @Test(priority = 1)
    void Test1(){
        System.out.println("Test 1");
    }
    @Test(priority = 2)
    void Test2(){
        System.out.println("Test 2");
    }
    @AfterMethod
    void afterMethodTest(){
        System.out.println("After Method Test");
    }
    @AfterClass
    void afterClassTest(){
        System.out.println("After Class Test");
    }
    @AfterTest
    void afterTest(){
        System.out.println("After Test");
    }

    @AfterSuite
    void afterSuiteTest(){
        System.out.println("After Suite Test");
    }
}

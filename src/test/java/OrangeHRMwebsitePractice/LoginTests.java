package OrangeHRMwebsitePractice;

import org.testng.annotations.Test;

public class LoginTests {
    @Test(priority = 1, groups = { "sanity" })
    void LoginWithEmail() {
        System.out.println("login with email");
    }

    @Test(priority = 2, groups = { "sanity" })
    void LoginWithGoogle() {
        System.out.println("login with google");
    }

    @Test(priority = 3, groups = { "sanity" })
    void LoginWithFacebook() {
        System.out.println("login with facebook");
    }

    @Test(priority = 4, groups = { "sanity" })
    void LoginWithInstagram() {
        System.out.println("login with instagram");
    }
}

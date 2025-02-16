package OrangeHRMwebsitePractice;

import org.testng.annotations.Test;

public class SignUpTests {
    @Test(priority = 1, groups = { "regression" })
    void SignUpWithEmail() {
        System.out.println("sign up with email");
    }

    @Test(priority = 2, groups = { "regression" })
    void SignUpWithGoogle() {
        System.out.println("sign up with google");
    }

    @Test(priority = 3, groups = { "regression" })
    void SignUpWithFacebook() {
        System.out.println("sign up with facebook");
    }

    @Test(priority = 4, groups = { "regression" })
    void SignUpWithInstagram() {
        System.out.println("sign up with instagram");
    }
}

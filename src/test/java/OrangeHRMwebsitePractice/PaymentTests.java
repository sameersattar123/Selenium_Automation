package OrangeHRMwebsitePractice;

import org.testng.annotations.Test;

public class PaymentTests {
    @Test(priority = 1, groups = { "regression", "sanity" , "functional" })
    void PaymentWithEmail() {
        System.out.println("Payment with email");
    }

    @Test(priority = 2, groups = { "regression", "sanity" , "functional" })
    void PaymentWithGoogle() {
        System.out.println("Payment with google");
    }

    @Test(priority = 3, groups = { "regression", "sanity" , "functional" })
    void PaymentWithFacebook() {
        System.out.println("Payment with facebook");
    }

    @Test(priority = 4, groups = { "regression", "sanity" , "functional" })
    void PaymentWithInstagram() {
        System.out.println("Payment with instagramPayment");
    }
}

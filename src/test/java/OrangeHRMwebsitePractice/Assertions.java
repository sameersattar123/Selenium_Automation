package OrangeHRMwebsitePractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
    @Test
    void testTitle() {

        // Hard Assertions

        Assert.assertEquals("sameer", "sameer"); // passes
        //Assert.assertEquals(123, 333); // failed

        //Assert.assertNotEquals("sameer", "sameer"); // failed
        Assert.assertNotEquals("sameer", "samee"); // passed

        //Assert.assertTrue(false); // failed
        Assert.assertTrue(true); // passed

        //Assert.assertFalse(true); // failed
        Assert.assertFalse(false); // passed

        //Assert.fail();

    }

    @Test
    void test_softAssertion(){
        System.out.println("testing");
        System.out.println("testing");
        SoftAssert sa = new SoftAssert();
        sa.assertEquals("sameer" , "sameer");
        System.out.println("testing");
        System.out.println("testing");
        sa.assertAll();
    }
}

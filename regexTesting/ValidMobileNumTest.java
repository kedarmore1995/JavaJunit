package regexTesting;

import org.example.ValidMobileNum;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class ValidMobileNumTest {
    ValidMobileNum mobileNum = new ValidMobileNum();

    @Test
    public void happyIfMobileNumberIsValid() {
        Assert.assertTrue(mobileNum.checkMobileNo("91 9422381333"));
    }

    @Test
    public void sadIfMobileNumberIsNotValid() {
        Assert.assertFalse(mobileNum.checkMobileNo("919422381333"));
    }
}

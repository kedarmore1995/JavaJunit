package regexTesting;

import org.example.ValidEmail;
import org.junit.Assert;
import org.junit.Test;

public class ValidEmailTest {
    ValidEmail validEmail = new ValidEmail();

    @Test
    public void happyIfEmailIsValid() {
        boolean result = validEmail.checkemail("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void sadIfEmailIsNotValid() {
        boolean result = validEmail.checkemail("abc@bl.in");
        Assert.assertFalse(result);
    }
}
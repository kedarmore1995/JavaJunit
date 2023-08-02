package regexTesting;

import org.example.ValidPassword;
import org.junit.Assert;
import org.junit.Test;

public class ValidPasswordTest {
 ValidPassword validPassword = new ValidPassword();

    @Test
    public void happyIfPasswordIsValid() {
       Assert.assertTrue(validPassword.passwordRules("Kedar3312@"));
    }
    @Test
    public void sadIfPasswordIsNotValid() {
        Assert.assertFalse(validPassword.passwordRules("Kedarmore"));
    }
}

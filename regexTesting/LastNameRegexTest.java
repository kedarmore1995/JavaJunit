package regexTesting;

import org.example.FirstNameRegex;
import org.example.LastNameRegex;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class LastNameRegexTest {
    LastNameRegex lname = new LastNameRegex();

    @Test
    public void happyIfFirstLetterIsUpper() {

        Assert.assertTrue(lname.checkUpper("More"));
    }

    @Test
    public void sadIfFirstLetterIsNotUpper() {

        Assert.assertFalse(lname.checkUpper("more"));
    }
}

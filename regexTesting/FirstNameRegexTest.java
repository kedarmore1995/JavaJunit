package regexTesting;

import org.example.FirstNameRegex;
import org.junit.Assert;
import org.junit.Test;

public class FirstNameRegexTest {
    FirstNameRegex fname = new FirstNameRegex();

    @Test
    public void happyIfFirstNameIsUpper() {

        Assert.assertTrue(fname.checkUpper("Kedar"));
    }
    @Test
            public void sadIfFirstNameNotUpper() {
        Assert.assertFalse(fname.checkUpper("kedar"));
    }
}


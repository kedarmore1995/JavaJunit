package regexTesting;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class SampleEmailValidationTest {
    String[] happyCases = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com","abc111@abc.com",
    "abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"};
    String[] sadCases = {"abc@%*.com", "abc@abc@gmail.com", "abc..2002@gmail.com","abc@gmail.com.aa.au",
    "abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com","abc()*@gmail.com",
    "abc.@gmail.com","abc@gmail.com.1a"};

    @Test
    public void isLastNameValid() {
        String regex = "^([a-z0-9+_-]+)(\\.)?[a-z0-9_-]+(@)([a-z0-9_-]+)((\\.)([a-z]{2,}))?(\\.)([a-z]{2,})$";
        System.out.println("Happy test cases: ");
        for (String str : happyCases) {
            Assert.assertTrue(Pattern.matches(regex, str));
            System.out.println("Entry for " + str + " is successful");
        }
        System.out.println("\n\n Sad test cases: ");
        for (String str : sadCases) {
            Assert.assertFalse(Pattern.matches(regex, str));
            System.out.println("Entry for " + str + " is failed");
        }
    }
}

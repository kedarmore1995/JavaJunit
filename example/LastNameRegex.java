package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastNameRegex {
    public static boolean checkUpper(String lastName) {
        Pattern p = Pattern.compile("[A-Z][a-z]{2,}");
        Matcher m = p.matcher(lastName);
        boolean ifPresent = m.find();
        return ifPresent;
    }
}


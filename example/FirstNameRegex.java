package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstNameRegex {
    public static boolean checkUpper(String name) {

        Pattern p = Pattern.compile("[A-Z][a-z]{2,}");
        Matcher m = p.matcher(name);
        boolean ifPresent=m.find();
        return ifPresent;
    }
}
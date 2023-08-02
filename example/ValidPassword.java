package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {

    public static boolean passwordRules(String password) {

        String regex = "^((?=.*?[A-Z])(?=.*?[0-9])(?=.*?[a-z])){8,}[0-9a-zA-Z]*[!@#$%^&*()_-][0-9a-zA-Z]*$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        return m.find();
    }
}
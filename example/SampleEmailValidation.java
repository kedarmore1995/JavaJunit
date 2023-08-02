package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleEmailValidation {
    public static boolean checkValidEmail(String emails){

        String regex = "^([a-z0-9+_-]+)(\\.)?[a-z0-9_-]+(@)([a-z0-9_-]+)((\\.)([a-z]{2,}))?(\\.)([a-z]{2,})$";

        Pattern pattern = Pattern.compile(regex);
        //Creating a Matcher object
        Matcher matcher = pattern.matcher(emails);
        return matcher.find();
    }
}

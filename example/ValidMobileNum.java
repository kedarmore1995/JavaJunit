package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMobileNum {
    public static boolean checkMobileNo(String mobileNum) {

        String regex = "([0-9]{2}) ([1-9][0-9]{9})$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(mobileNum);
        return m.find();
    }
}

package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail {
    static final String regex = "(abc.)+(xyz)?(@bl)+(.co.)+(in)?";

    public static boolean checkemail(String email){
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        boolean ifMatches = m.find() ;
        return ifMatches;
    }
}
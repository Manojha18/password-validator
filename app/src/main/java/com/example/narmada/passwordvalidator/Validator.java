package com.example.narmada.passwordvalidator;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Created by NARMADA on 11-Feb-18.
 */

public class Validator {
    public int rules = 0;

    public int validate(String input) {
        rules = 0;
        String str = input;
        if (((input.equalsIgnoreCase("password")))) {
            rules = rules + 1;
        }
        if ((str.length() >= 8)) {
            rules = rules + 1;
        }
        Pattern p = Pattern.compile("[0-9]");
        Matcher n = p.matcher(str);
        if (n.find()) {
            rules = rules + 1;
        }
        Pattern l = Pattern.compile("[a-z]");
        Matcher m = l.matcher(str);
        if (m.find()) {
            rules = rules + 1;
        }
        Pattern u = Pattern.compile("[A-Z]");
        Matcher o = u.matcher(str);
        if (o.find()) {
            rules = rules + 1;
        }
        Pattern s = Pattern.compile("[@#$%^&*]");
        Matcher r = s.matcher((str));
        if (r.find()) {
            rules = rules + 1;
        }

        return rules;
    }

}













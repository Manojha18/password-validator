package com.example.narmada.passwordvalidator;

/**
 * Created by NARMADA on 11-Feb-18.
 */

public class Validator {
    public int rules = 0;

    public int validate(String input) {
        rules = 0;
        String str = input;
        if (!((input.equalsIgnoreCase("password"))))  {
            rules=rules+1;
        }
        if (!(str.length()<9))  {
            rules=rules+1;
        }
        return rules;
    }













}

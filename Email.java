package com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public void mail() {
        Pattern p = Pattern.compile("[abc]{3}.[a-z]{3}+@[bl]{2}.[co]{2}.[a-z]{2}+");
        Matcher m = p.matcher("abc.def@bl.co.py");
        boolean b = m.matches();
        System.out.println(b);
    }

    public static void main(String[] args) {
        Email emailObj = new Email();
        emailObj.mail();
    }
}

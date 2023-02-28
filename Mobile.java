package com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mobile {
    public void mobile() {
        Pattern p = Pattern.compile("[91]{2}\\s[0-9]{10}+");
        Matcher m = p.matcher("91 9945632456");
        boolean b = m.matches();
        System.out.println(b);
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.mobile();
    }
}

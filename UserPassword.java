package com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserPassword {
    public void Password(){

        Pattern p = Pattern.compile("[A-Z]{1}[A-Za-z]{4,}[0-9]{1,}+[@#$&^%~]");
        Matcher m = p.matcher("Zmklop2&");
        boolean b = m.matches();
        System.out.println(b);
    }
    public static void main(String[] args) {
        UserPassword userPassword = new UserPassword();
        userPassword.Password();
    }
}


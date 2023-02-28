package com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstName {
    public void Last(){
        Pattern p = Pattern.compile("[A-Z]{1}[a-z]+");
        Matcher m = p.matcher("Praveen");
        boolean b = m.matches();
        System.out.println(b);
    }
    public static void main(String[] args) {
        FirstName firstObj = new FirstName();
        firstObj.Last();
    }
}

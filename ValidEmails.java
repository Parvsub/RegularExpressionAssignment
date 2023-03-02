package com.regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmails {
    public static void EmailValidation(String email){
        String regex = ("[^.]{1}[a-c01+.-]{3,7}+@[a-z.,1]{5,13}+[^.]{1}");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean b = matcher.matches();
        System.out.println(b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the email");
        String email = scanner.next();
        ValidEmails.EmailValidation(email);
    }
}

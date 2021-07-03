package com.sda;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie18 {
    public static void main(String[] args) {
        String regex = "a*\\spsik";

        Pattern pattern = Pattern.compile(regex);

        String input = "aaaaa psik";

        Matcher nasz_matcher = pattern.matcher(input);


        if(nasz_matcher.matches()){
            System.out.println("kichasz");
        } else {
            System.out.println("nie kichasz");
        }
    }
}

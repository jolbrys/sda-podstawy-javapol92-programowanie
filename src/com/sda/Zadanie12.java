package com.sda;

public class Zadanie12 {
    public static void main(String[] args) {
        String napis = "AAB asdf QQQQQ 1234";

        int licznik = 0;

        for(int i = 0; i < napis.length(); i++){
            if(napis.charAt(i) == ' '){
                licznik++;
            }
        }
        double procent = (double)licznik/napis.length() * 100;
        System.out.println("w tekscie jest " + Math.round(procent * 100.0)/100.0 + "% spacji");
    }
}

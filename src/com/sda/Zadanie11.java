package com.sda;

import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String slowo = "";
        String najdluzsze = "";

        while(!slowo.equals("Starczy")){
            slowo = scanner.next();
            if(slowo.length() > najdluzsze.length() && !slowo.equals("Starczy")){
                najdluzsze = slowo;
            }
        }
        if(najdluzsze.length() == 0) System.out.println("nie podano zadnego tekstu");
        else System.out.println(najdluzsze);
    }
}

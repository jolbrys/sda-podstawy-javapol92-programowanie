package com.sda;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dlugosc = scanner.nextInt();

        //pierwsza linijka
        for(int i = 1; i <= dlugosc; i++){
            if(i%8 == 1 || i%8 == 0) System.out.print("*");
            else System.out.print(" ");
        }
        System.out.println();
        //druga linijka
        for(int i = 1; i <= dlugosc; i++){
            if(i%8 == 2 || i%8 == 7) System.out.print("*");
            else System.out.print(" ");
        }
        System.out.println();

        //trzecia linijka
        for(int i = 1; i <= dlugosc; i++){
            if(i%8 == 3 || i%8 == 6) System.out.print("*");
            else System.out.print(" ");
        }
        System.out.println();

        //czwarta linijka
        for(int i = 1; i <= dlugosc; i++){
            if(i%8 == 4 || i%8 == 5) System.out.print("*");
            else System.out.print(" ");
        }
        System.out.println();
    }
}

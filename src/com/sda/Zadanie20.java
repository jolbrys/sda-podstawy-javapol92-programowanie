package com.sda;

import java.util.Random;
import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess = -1;
        Random r = new Random();
        int liczba = r.nextInt(100);

        while(liczba != guess){
            guess = scanner.nextInt();
            if(liczba > guess) System.out.println("za mało");
            else if(liczba < guess) System.out.println("za dużo");
            else System.out.println("Bingo!");
        }


    }
}

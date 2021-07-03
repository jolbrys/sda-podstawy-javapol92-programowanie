package com.sda;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

        System.out.println("suma cyfr liczby " + liczba + " to " + sumuj(liczba));
    }

    static int sumuj(int liczba){
        int cyfra, suma = 0;

        while(liczba > 0){
            cyfra = liczba % 10;
            suma += cyfra;
            liczba /= 10;
        }
        return suma;
    }
}

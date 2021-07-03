package com.sda;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ile liczb fibonacciego chcesz wypisac?");
        int limit = scanner.nextInt();
        fibonacci(limit);
    }

    static void fibonacci(int limit){
        int liczba1 = 0;
        int liczba2 = 1;
        int liczba3;
        System.out.print(1);
        for(int i = 2; i <= limit; i++){
            liczba3 = liczba1 + liczba2;
            System.out.print(", " + liczba3);
            liczba1 = liczba2;
            liczba2 = liczba3;
        }

    }
}

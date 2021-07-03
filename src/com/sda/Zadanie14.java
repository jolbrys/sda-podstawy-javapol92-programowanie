package com.sda;

import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char znak1 = scanner.next().charAt(0);
        char znak2 = scanner.next().charAt(0);
        int roznica = 0;

        if(znak1 > znak1) roznica = (int) (znak1 - znak2);

            System.out.println("miedzy znakami " + znak1 + " : " + znak2 + " są " + roznica + "inne znaki" );
    }
}

package com.sda;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(isPrime(number)) System.out.println("liczba pierwsza");
        else System.out.println("liczba druga hehehe");
    }

    private static boolean isPrime(int number){
        boolean result = true;
        for(int i = 2; i < number/2; i++){
            if(number % i == 0){
                result = false;
            }
        }
        return result;
    }
}

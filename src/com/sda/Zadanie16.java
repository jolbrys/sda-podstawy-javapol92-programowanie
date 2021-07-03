package com.sda;

import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        //wczytywanie liczb do tablicy
        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[10];
        for (int i = 0; i < 10; i++){
            tablica[i] = scanner.nextInt();
        }

        //dwie zmienne:
        //licznik do zliczania dlugosci kolejnych rosnących podciągów
        //max porownujemy z kolejnymi naliczonymi dlugościami podciagów
        //i w przypadku przekroczenia poprzedniego rekordu, nadpisujemy go nową wartością
        int licznik = 1;
        int max = 1;
        for(int i = 1; i < tablica.length; i++){
            if(tablica[i] > tablica[i-1]){
                licznik++;

                //sprawdzenie maxa
                if(licznik > max){
                    max = licznik;
                }
            }
            else{
                //czyszczenie licznika
                licznik = 1;
            }
        }

        //z definicji ciąg to co najmniej 3 liczby
        if(max < 3){
            System.out.println("nie ma rosnacego podciagu");
        }else{
            System.out.println("najdluzszy rosnacy podciag ma dlugosc: " + max);
        }
    }
}

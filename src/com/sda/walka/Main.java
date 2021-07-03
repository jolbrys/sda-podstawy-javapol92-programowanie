package com.sda.walka;

public class Main {

    public static void main(String[] args) {
        Wojownik woj1 = new Wojownik("Jakub", 3, 100);
        Wojownik woj2 = new Wojownik("Andrzej");

        System.out.println(woj1.toString());
        System.out.println(woj2.toString());

        System.out.println("\nodbywa sie walka\n");
        woj1.fight(woj2);

        System.out.println();
        System.out.println(woj1.toString());
        System.out.println(woj2.toString());


    }
}

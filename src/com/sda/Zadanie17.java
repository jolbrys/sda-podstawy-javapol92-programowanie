package com.sda;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Zadanie17 {
    public static void main(String[] args) {


        LocalDate now = LocalDate.now();
        LocalDate kolejne = LocalDate.parse("2021-07-20");

        long diff = ChronoUnit.DAYS.between(now, kolejne);

        System.out.println(diff);
    }
}

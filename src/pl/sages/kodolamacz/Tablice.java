package pl.sages.kodolamacz;

import java.util.ArrayList;

public class Tablice {

    int age; //domyslna wartosc 0

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        // na zmienna typu int nie wstawimy całej tablicy
        // int d = new int[5];
        Object[] tab = {"abc",1, 4.21};

        int[] tablica = new int[10];
        // jesli nie zadeklaruje wartosci w tablicy (prymitywnych)
        // to dostana wartosci domyslne, czyli zero

        double[] tablicaRzeczywista = new double[5];
        String[] napisy = new String[5];

        // elementy indeksowane sa od zera
        napisy[0] = "Ala";
        napisy[1] = "ma";
        napisy[2] = "kota";

        System.out.println(napisy[3]);
        System.out.println(tablica[0]);
    }

}

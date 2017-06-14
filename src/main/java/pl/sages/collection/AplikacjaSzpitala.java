package pl.sages.collection;

import pl.sages.hospital.Patient;

public class AplikacjaSzpitala {

    public static void main(String[] args) {
        Patient kowalski = new Patient("Jan Kowalski", 25);
        Patient nowak = new Patient("Adam Nowak", 33);

        BazaDanych bazaDanych = new BazaDanych();
        bazaDanych.zapisz(kowalski);
        bazaDanych.zapisz(nowak);

        Patient pacjent = bazaDanych.wyszukaj(1);
        System.out.println(pacjent);
    }

}

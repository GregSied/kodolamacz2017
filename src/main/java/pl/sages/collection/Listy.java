package pl.sages.collection;

import pl.sages.klasy.Dog;
import pl.sages.klasy.Pet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listy {

    // listy mają kolejność i dzięki temu na podstawie indeksów
    // możemy wyciągać konkretne elementy z listy
    public static void main(String[] args) {

        // opieramy się o interfejs, a nie o konkretną implementację
        List lista = new ArrayList();
        lista.add(1); // indeks 0
        lista.add(2); // indeks 1
        lista.add(5); // indeks 2
        lista.add(5); // indeks 3

        System.out.println("Na miejscu o indeksie 2 siedzi "+lista.get(2));
        System.out.println("Lista ma teraz "+lista.size()+" elementów");
        lista.add(12);
        System.out.println("Lista ma teraz "+lista.size()+" elementów");
        System.out.println("Czy lista zawiera 2? "+lista.contains(2));
        // jeśli jest więcej niż jedno to zwraca indeks pierwszego
        System.out.println("Jaki indeks ma element 5? "+lista.indexOf(5));

        System.out.println(lista);
        // czyścimy tablice
        lista.clear();
        System.out.println(lista);

    }

}

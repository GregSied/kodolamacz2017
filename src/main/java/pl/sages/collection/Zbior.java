package pl.sages.collection;

import java.util.HashSet;
import java.util.Set;

public class Zbior {

    // zbiór nie ma kolejność i elementy są unikatowe
    public static void main(String[] args) {
        Set<Integer> zbior = new HashSet<>();

        zbior.add(12);

        zbior.add(5);
        System.out.println(zbior);
        System.out.println("Dodaje kolejną 5 ");
        zbior.add(5);
        System.out.println(zbior);

        System.out.println(zbior.size());
        zbior.remove(5);
        System.out.println(zbior);

        // w zbiorze metoda contains - czy zawiera? działa bardzo szybko
        // nie przechodzę po wszystkich elementach (tak jak w liście)
        //
        // tylko wyliczam hash i sprawdzam czy jest
        // w przypadku listy złożonośc jest O(n) gdzie n to liczba elementów
        // w przypadku zbioru złożoność jest O(1)
        System.out.println(zbior.contains(5));

        // dla chętnych złożoność obliczeniowa
        // w szczególność złożonść algorytmów sortowania
        // O(n!) - silnia - najgorsza
        // O(n^2)
        // O(n * ln(n)) - najlepsze algorytmy sortowania

    }

}

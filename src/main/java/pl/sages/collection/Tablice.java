package pl.sages.collection;

import java.util.Arrays;

public class Tablice {

    // tablica typów prymitywnych int, char, double, boolean
    int[] liczby = new int[10];

    // tablica obiektów
    // ZAWSZE podczas inicjalizacji tablicy należy określić jej rozmiar
    String[] napisy = new String[10];

    // rozmiar kolekcji może być modyfikowany dynamicznie


    public static void main(String[] args) {
        int[] wartosci = {1,2,3};
        // to się wypisze jako int[] @ hashcode
        System.out.println(wartosci);

        // to się wypisze [1, 2, 3]
        System.out.println(Arrays.toString(wartosci));
        int i = Arrays.binarySearch(wartosci, 1);

        int[] razDwaTrzy = {1,2,3};
        System.out.println("Czy dwie tablice są takie same?");
        System.out.println(Arrays.equals(wartosci, razDwaTrzy));

        int[] tab = {1, 4, 8, 12, 16, 17, 18, 28, 33};
        // ten element jest, więc dostajemy jego indeks
        System.out.println(Arrays.binarySearch(tab, 4));
        // tego nie ma, więc jest ujemna wartość określająca
        // miejsce gdzie ta wartość powinna być -3 czyli po 4
        System.out.println(Arrays.binarySearch(tab, 5));

        // porządkujemy tablice
        int[] pomieszana = {74, 12, 85, 33, 11, 85, 2, -5};
        Arrays.sort(pomieszana);
        System.out.println(Arrays.toString(pomieszana));

        // dwie zmienne wskazują na to samo miejsce w pamięci
        // więc zmieniając coś przy użyciu jednej zmiennej
        // ta druga też to "odczuwa" :)
        int[] drugaTablica = pomieszana;
        System.out.println(Arrays.toString(pomieszana));
        drugaTablica[1] = 1000;
        System.out.println(Arrays.toString(pomieszana));

        // musimy więc stworzyć NOWĄ tablicę
        int[] trzeciaTablica = new int[pomieszana.length];
        // najpierw skąd i od którego indeksu
        // na co i od którego indeksu chcemy kopiować
        // na końcu jak dużo tych elementów kopiujemy
        System.arraycopy(pomieszana, 0,
                trzeciaTablica, 0, pomieszana.length);
//        System.arraycopy(SKĄD, OD_KTÓREGO,
//                DOKĄD, OD_KTÓREGO, ILE_ELEMENTÓW);
        trzeciaTablica[2] = -9999;

        System.out.println(Arrays.toString(trzeciaTablica));
        System.out.println(Arrays.toString(pomieszana));

    }

}

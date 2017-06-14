package pl.sages.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zad32 {

    public static void main(String[] args) {
        String[] literki = {"a","b","c","d","e"};
        String[] nowa = new String[literki.length];

        System.arraycopy(literki, 0,
                nowa, 0, literki.length);

        // itar
        for (int i = 0; i < nowa.length; i++) {
            String s = nowa[i];
            System.out.print(s + " ");
        }
        System.out.println();

        // iter
        for (String s : nowa) {
            System.out.print(s + " ");
        }

        List<String> lista = new ArrayList<>();
        for (String napis : nowa) {
            lista.add(napis);
        }

        // itli
        // różnica - tablica ma długość (length)
        // lista ma rozmiar (size)
        // po liście możemy iterować się tak jak po tablicy
        // po indeksach jej elementów
        for (int i = 0; i < lista.size(); i++) {
            String s =  lista.get(i);
            System.out.print(s + " ");
        }

        // iter
        // dokładnie taka sama składnia jak dla tablicy
        for (String s : lista) {
            System.out.print(s + " ");
        }

        System.out.println("iterator");
        // itit
        // iterator jest bezpieczny jeśli modyfikujemy
        // kolekcję po której się iterujemy
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.print(next + " ");
            if("c".equals(next)){
                System.out.print("usuwam C");
                iterator.remove();
            }

        }

        System.out.println("Usuwamy C jeśli znajdziemy");

        // usunęliśmy literkę C więc musimy ją znowu dodać
        lista.add(2, "c");

        for (int i = 0; i < lista.size(); i++) {
            String s =  lista.get(i);
            System.out.print(s + " ");
            if("c".equals(s)){
                System.out.print("usuwam C");
                lista.remove(i);
                // bez cofnięcia tego indeksu pominęlibyśmy literkę D
                i--;
            }
        }
    }

}

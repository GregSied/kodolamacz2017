package pl.sages.collection;

import java.util.ArrayList;
import java.util.List;

public class Generyki {

    public static void main(String[] args) {
        // od teraz moja lista przyjmuje tylko wartości Integer
        // ten drugi Integer jest zbędny bo kompilator (chyba od javy 1.6)
        // domyśla się typu na podstawie lewej strony
        List<Integer> list = new ArrayList<Integer>();

        list.add(12);
        list.add(15);
        // nie można do niej dodać napisu ani wartości logicznej
        //list.add("Napis");
        //list.add(true);

        // nie muszę robić rzutowania, bo skoro mogę na listę wsadzić
        // tylko liczby, no to tylko liczby mogę wyjąć
        Integer integer = list.get(1);

        List<String> napisy = new ArrayList<>();
        napisy.add("Tekst");
        napisy.add("Raz dwa trzy");
    }

}

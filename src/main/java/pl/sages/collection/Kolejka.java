package pl.sages.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class Kolejka {

    public static void main(String[] args) {
        Queue<String> kolejka = new ArrayDeque<>();

        // FIFO
        // First In - First Out
        // Ania pierwsza weszła, więc pierwsza wychodzi

        kolejka.add("Ania");
        kolejka.add("Borys");
        kolejka.add("Celina");
        kolejka.add("Celina");

        System.out.println(kolejka);
        System.out.println(kolejka.poll());
        System.out.println(kolejka.poll());
        System.out.println(kolejka);
    }

}

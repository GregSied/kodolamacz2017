package pl.sages.collection;

import java.util.Stack;

public class Stos {

    public static void main(String[] args) {
        Stack<String> stos = new Stack<>();

        // FILO
        // pierwszy na wejściu jest ostatnim na wyjściu

        stos.push("Ania");
        stos.push("Bruno");
        stos.push("Czesio");
        System.out.println(stos);
        System.out.println(stos.pop());
        System.out.println(stos);
    }

}

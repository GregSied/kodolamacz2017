package pl.sages.collection;

import java.util.ArrayList;
import java.util.List;

public class BezGenerykow {

    public static void main(String[] args) {
        List lista = new ArrayList();

        lista.add("Napis");
        lista.add(true);
        lista.add(2);
        lista.add(3.14);


        // mam Object - bo skąd mam wiedizeć co tu siedzi?
        Object o = lista.get(2);

        // mogę rzutować
        int i = (int) lista.get(2);
        System.out.println(i);

        System.out.println("Rozmiar "+lista.size());
        // podmieniamy element na drugim miejscu
        lista.add(2, "PIĘTNAŚCIE");
        System.out.println("Rozmiar "+lista.size());
        int j = (int) lista.get(2);
        System.out.println(j);

    }

}

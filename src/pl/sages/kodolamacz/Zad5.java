package pl.sages.kodolamacz;

import pl.sages.vending.Coin;

public class Zad5 {

    public static void main(String[] args) {
        String[] tablica = new String[5];
        tablica[0] = "Ala";
        tablica[1] = "ma";
        tablica[2] = "psa";
        tablica[3] = "i";
        tablica[4] = "kota";

        String[] szybszy = {"Ala", "ma","psa","i","kota"};

        // pętla for po indeksach
        for(int k = 0; k < tablica.length; k++){
            System.out.print(tablica[k]);
            System.out.print(" ");
        }

        // pętla while
        int indeks = 0;
        while(indeks < tablica.length){
            System.out.print(tablica[indeks]);
            System.out.print(" ");
            indeks++;
        }

        // pętla foreach
        // for( taką zmienną (typ) o takiej nazwie : po tych elementach)
        // najczytelniejsza i najbardziej preferowana forma
        for(String s : szybszy){
            System.out.print(s);
            System.out.print(" ");
        }

    }

}

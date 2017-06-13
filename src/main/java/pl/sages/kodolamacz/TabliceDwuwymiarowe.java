package pl.sages.kodolamacz;

import java.util.Random;

public class TabliceDwuwymiarowe {

    public static void main(String[] args) {
        int[] jedno = new int[10];
        int[][] dwu = new int[4][5];

        // to generuje pseudolosowe liczby
        Random random = new Random();
        random.nextInt(100);

        // metoda dostepu do elementów
        dwu[2][3] = 15;

        // dlugość tablicy drugiej (1 bo liczymy od 0 indeksy)
        int dlugoscTablicyDrugiej = dwu[1].length;


        for(int w = 0; w < dwu.length; w++){
            int[] wiersz = dwu[w];
            for (int k = 0; k < dwu[w].length; k++) {
                wiersz[k] = random.nextInt(100);
            }
        }

        // bardzo trudneo obliczenia na naszej "macierzy"

        // na koniec chce wypisać wynik

        for(int w = 0; w < dwu.length; w++){
            int[] wiersz = dwu[w];
            for (int k = 0; k < wiersz.length; k++) {
                if(wiersz[k] < 10){
                    System.out.print(" ");
                }
                System.out.print(wiersz[k] + " ");
            }
            System.out.println();
        }

        System.out.println("Przed pętlami");
        for (int i = 0; i < 5; i++) {
            System.out.println("wewnątrz zewnętrznej start");
            for (int j = 0; j < 3; j++) {
                System.out.println("wewnątrz wewnętrznej");
                System.out.println("i=" + i + " j="+j);
            }
            System.out.println("wewnątrz zewnętrznej koniec");
        }
    }

}

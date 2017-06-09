package pl.sages.kodolamacz;

import java.util.Random;

public class MonteCarlo {

    public static void main(String[] args) {
        // tutaj dodaje komentarz i chce zrobić drugi commit
        Random random = new Random();
        int licznik = 0;
        int iteracje = 100000000;
        for (int i = 0; i < iteracje; i++) {
            // losowanie punktu x,y
            double x = random.nextDouble() * 2 - 1;
            double y = random.nextDouble() * 2 - 1;
            //System.out.println("x="+x + " y=" + y);
            // sprawdzenie czy wewnatrz kola
            boolean czyWokregu = (x * x + y * y) < 1;
            if(czyWokregu){
                licznik++;
            }
        }
        System.out.println("Pi wynosi " + 4*(licznik/(double) iteracje));
    }

}

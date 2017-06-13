package pl.sages.kodolamacz;

public class Petle {

    public static void main(String[] args) {
        String[] napisy = new String[3];

        // elementy indeksowane sa od zera
        napisy[0] = "Ala";
        napisy[1] = "ma";
        napisy[2] = "kota";

        for (int i = 0; i < napisy.length; i++) {
            String s = napisy[i];
            System.out.println(s);
        }

        for (String s : napisy) {
            System.out.println(s);
        }

        // i++
        // skrocony zapis:
        // i = i + 1

        // jesli jest jedna linijka to mozna nawiasy klamrowe opuscic
        // ale dobrą praktyką jest je stosować zawsze
        // for(warunek poczatkowy; warunek stopu; operacja do obrót pętli)
        // warunek początkowy i = 0;
        // końcowy - tak długo jak i < 3 - jeśli i będzie równe 3 to wtedy
        // pętla się zakończy
        // operacja co obrót - zwiększanie wartości i
        for(int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
            System.out.println("Wartosc z tablicy=" + napisy[i]);
        }

        for (int zmienna = 1; zmienna < 100; zmienna = zmienna * 2) {
            System.out.println("zmienna = " + zmienna);
        }


        int[] tab = new int[20];
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        Person olaf = new Person(true);

        while(!olaf.isAdult()){
            olaf.birthday();
            System.out.println("Sto lat! Masz już "+olaf.getPersonAgeOf() + " lat!");
        }

        // for i while sa równoważne

        int i = 0;
        while(i < 10){
            i++;
        }

        // w przypadku iteracji takiej po wartościach
        // to for wygląda lepiej
        for(int k=0; k<10; k++){

        }

        // a tutaj jednak while jest czytelniejszy
        Person ala = new Person(false);
        while(!ala.isAdult()){
            ala.birthday();
        }

        // do while gwarantuje, że kod w pętli ZAWSZE wykona się przynajmniej RAZ
        do{

        }while (!ala.isAdult());

        for(Person marian = new Person(true);
            !marian.isAdult();
            marian.birthday()){

        }

        for (int k = 0; k < 15; k++) {
            if(k == 8){
                break;
            }else if(k % 2 == 1){
                continue;
            }
            System.out.println(k);
        }
    }

}

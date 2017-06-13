package pl.sages.kodolamacz;

public class Zad1 {

    public static void main(String[] args) {
        int wiek = 20;
        int costam = 30;

        String text = " " + wiek + "," + costam;

        // wypisuje tekst
        System.out.print("");

        // wypisuje tekst i nowa linie na koncu tekstu
        System.out.println(text);

        // to jest to samo to println(text)
        System.out.print(text + "\n");
    }

}

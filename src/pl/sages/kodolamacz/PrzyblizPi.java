package pl.sages.kodolamacz;

public class PrzyblizPi {

    public static void main(String[] args) {
        double pi = 0;
        int licznik = 1;
        double mianownik = 1;
        int iteracje = 10000000;
        for (int i = 0; i < iteracje; i++) {
            pi = pi + (licznik/mianownik);
            licznik = licznik * (-1);
            mianownik = mianownik + 2;
        }
        System.out.println("Pi prawdziwe "+ Math.PI);
        System.out.println("Pi nasze     "+ 4*pi);
    }

}

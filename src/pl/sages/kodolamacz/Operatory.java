package pl.sages.kodolamacz;

public class Operatory {

    public static void main(String[] args) {
        // operatory liczbone
        int suma = 2 + 5;
        int roznica = 18 - 1;
        double mnozenie = 12.5 * 4;
        double potega = Math.pow(4, 0.5);
        int modulo = 16 % 7;

        System.out.println(potega);

        // operatory logiczne
        // = przypisanie wartosci
        // == przyrównanie wartości
        System.out.println( (2 * 2) == 4);

        System.out.println( (2 + 3) != 4);
        System.out.println( !((2 + 3) == 4));

        System.out.println( true | false);
        System.out.println( true & false);
        System.out.println("(2+2)==4 & 3*2==6");
        System.out.println( (2+2)==4 & 3*2==6);

        System.out.println( true || false);
        System.out.println( false && true);

        System.out.println( 6 > 10);
        System.out.println( 7 >= 7);
        // skrócony zapis poniższego:
        System.out.println( 7 > 7 | 7 == 7);
    }

}

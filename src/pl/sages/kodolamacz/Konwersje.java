package pl.sages.kodolamacz;

public class Konwersje {

    public static void main(String[] args) {
        int zmienna = 22;
        String liczba = "" + 123;
        String liczba2 = String.valueOf(123);
        String liczba3 = Integer.toString(zmienna);

        // musi to być znak (character)
        int znak = 'a';
        int znak2 = '!';
        char znak3 = '1';
        int znak4 = '1';
        char znak5 = 97;
        System.out.println(znak);
        System.out.println(znak2);
        System.out.println(znak5);

        boolean aTrue = Boolean.parseBoolean("true");
        if (aTrue) {
            System.out.println("wartość jest true");
        }


        // a nie napis (String)
        //int znak = "a";

        int napis1 = Integer.valueOf("123");
        int napis2 = Integer.valueOf("abc");

    }

}

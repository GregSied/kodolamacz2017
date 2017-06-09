package pl.sages.kodolamacz;

import java.math.BigDecimal;

public class TabliceNierowneWymiary {

    public static void main(String[] args) {
        // jeśli nie określam drugiego wymiaru to muszę
        // wszystkie tablice inicjować ręcznie
        int[][] tab = new int[5][];
        int[][] sudoku = {{1, 0, 0, 2, 5, 8},
                        {2, 4, 8}};
        tab[0] = new int[12];
        tab[1] = new int[4];
        tab[2] = new int[1];

        System.out.println(1/6.0 + 1/3.0 + 1/2.0 == 1.0);
        System.out.println(1/10.0 + 1/10.0 + 1/10.0 == 0.3);
        System.out.println(1/10.0 + 1/10.0 + 1/10.0 - 0.3 < 1e-15);

        char[] a = new String("Abc").toCharArray();
        char[] b = {65, 97, 99};
        for (char c : b) {
            System.out.print(c);
        }
    }

}

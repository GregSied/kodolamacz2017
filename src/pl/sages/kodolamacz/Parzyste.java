package pl.sages.kodolamacz;

public class Parzyste {

    static int policzParzyste(int[] tab){
        int licznik = 0;
        for (int i : tab) {
            if(i % 2 == 0){
                licznik++;
            }
        }
        return licznik;
    }

    public static void main(String[] args) {
        int[] tab = {1,2,2,2,3,4};

        new Parzyste().policzParzyste(tab);

        policzParzyste(tab);
    }

}

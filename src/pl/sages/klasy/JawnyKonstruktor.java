package pl.sages.klasy;

public class JawnyKonstruktor extends KlasaMatka{

    public JawnyKonstruktor(int i) {
        super(i);
    }
}

class KlasaMatka{

    int i;

    public KlasaMatka(int i) {
        this.i = i;
    }
}

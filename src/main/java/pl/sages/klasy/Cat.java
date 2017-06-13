package pl.sages.klasy;

// jeśli klasa nie jest publiczna to jej składowe również nie będą widoczne
// (nawet jeśli same będą publiczne)
// żeby zobaczyć składową klasy, trzeba najpierw widzieć klasę
class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    public void mrucz(){}

    @Override
    public void voice(){
        System.out.println("Miau");
    }

    public static void main(String[] args) {
        Cat mruczek = new Cat("Mruczek");
        System.out.println(mruczek.getName());
        mruczek.voice();
    }
}

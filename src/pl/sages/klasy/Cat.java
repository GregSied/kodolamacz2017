package pl.sages.klasy;

public class Cat extends Pet {

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

package pl.sages.klasy;

public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("fruuuu");
    }

    @Override
    public void voice() {
        System.out.println(this.getName()+" chce krakersa");
    }
}

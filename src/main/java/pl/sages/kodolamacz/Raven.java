package pl.sages.kodolamacz;

import pl.sages.klasy.Bird;

public class Raven extends Bird {

    public Raven(String name) {
        super(name, "czarny");
    }

    @Override
    public void fly() {
        System.out.println("Kruk koloru" + this.colour + " leci fruuuuuu");
    }

}

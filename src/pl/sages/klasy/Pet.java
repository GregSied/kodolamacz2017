package pl.sages.klasy;

public class Pet {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    // możemy określić co ma się stać w przypadku usuwania obiektu
    @Override
    public void finalize(){

    }

}

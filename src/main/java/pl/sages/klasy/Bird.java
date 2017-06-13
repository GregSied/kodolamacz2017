package pl.sages.klasy;

public abstract class Bird extends Pet {

    // pole jest protected, jest widoczne w ramach pakietu
    // i w ramach klas, które dziedziczą po klasie Bird (również
    // z innych pakietów) - w szczególności klasa Raven z pakietu
    // pl.sages.kodolamacz
    protected String colour;

    public Bird(String name, String colour) {
        super(name);
        this.colour = colour;
    }

    // nie można nadpisać finalnej metody
//    public String getName(){
//        return "Ptak";
//    }

    public abstract void fly();

    @Override
    public void voice(){
        System.out.println("ćwir ćwir");
    }
}

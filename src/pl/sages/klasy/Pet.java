package pl.sages.klasy;

public abstract class Pet {

    private int age;

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // nie wiem jak zwierze ma się zachować gdy powiem daj głos
    public abstract void voice();


    // możemy określić co ma się stać w przypadku usuwania obiektu
    @Override
    public void finalize(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pet pet = (Pet) o;

        if (age != pet.age) return false;
        return name != null ? name.equals(pet.name) : pet.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {

        // nie możemy powołać Pet bo jest klasa abstrakcyjna
        //Pet a = new Pet("a");
        // metoda voice dostępna z klasy Pet
//        a.voice();

        // dostępne są również wszystkei z klasy nadrzędnej czyli Object
//        a.toString();
//        System.out.println(a.equals(new Pet("a")));
        // nie zgadzają sie klasy, więc nie jest to samo
        // ale jeśli inaczej zaimplementujemy metodę equals to wynik
        // może być inny
//        System.out.println(a.equals(new Dog("a")));
    }

}

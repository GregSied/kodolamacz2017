package pl.sages.klasy;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
        // zwierze ma imie i pies jest zwierzeciem, ale
        // samo imie jest prywatne, wiec z poziomu klasy pies
        // nie mamy do niej dostępu
        //this.name
    }

    @Override
    public void voice(){
        System.out.println("Hau hau");
    }

    public void aport(){

    }

    public static void main(String[] args) {
        Dog reksio = new Dog("Reksio");
        System.out.println(reksio.getName());
        reksio.voice();
    }
}

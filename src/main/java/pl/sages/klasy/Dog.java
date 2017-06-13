package pl.sages.klasy;

public class Dog extends Pet implements Glaskalny, Aportujacy{

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

    @Override
    public void aport(){

    }

    public static void main(String[] args) {
        Dog reksio = new Dog("Reksio");
        System.out.println(reksio.getName());
        reksio.voice();
    }

    @Override
    public void poglaszcz() {
        System.out.println("Głaszczemy " + getName());
    }
}

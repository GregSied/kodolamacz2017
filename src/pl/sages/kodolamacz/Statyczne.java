package pl.sages.kodolamacz;

public class Statyczne {

    //przypisane do KLASY - Statyczne
    static int count = 0;
    // przypisane do INSTACJI tej klasy - np obiekt statyczne
    String name;

    public Statyczne() {
        count++;
        name = "ABC";
    }

    String getName(){
        getCount(); // statyczną w zwyklej można użyć
        return name;
    }

    static int getCount(){
        // getName(); nie-statyczna metoda w metodzie statycznej
        return count;
    }

    public static void main(String[] args) {
        new Statyczne().getName();

        for (int i = 0; i < 10; i++) {
            new Statyczne();
        }

        Statyczne statyczne = new Statyczne();
        statyczne.getName();
        System.out.println(statyczne.name);

        Statyczne.getCount();

        System.out.println(Statyczne.count);
    }

}

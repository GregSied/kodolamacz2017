package pl.sages.klasy;

public class Article {

    static int counter = 0;

    int id;
    private String name;
    String description;
    int price;

    public Article() {
        this("",0);
        //odpali poniższy kontruktor, który odpali następny:
        // this("","",0);
    }

    public Article(String name, int price){
        this(name, "", price);

    }

    public Article(String name, String description, int price) {
        //counter++;
        // zmienna++ zwieksza wartosc zmiennej o 1
        // ++counter - prefixowy
        // counter++ - postfixowy
        // counter = counter + 1;

        this.id = ++counter;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // nazwa nie powinna się zmienić, więc mogę pobrać tylko
    public String getName() {
        return name;
    }

    // cenę mogę pobrać
    public int getPrice() {
        return price;
    }

    // zmienić jeśli będzie prmocja
    public void setPrice(int price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "Artykuł sklepowy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + (price/100 + "." + price%100) +
                '}';
    }
}

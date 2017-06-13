package pl.sages.vending;

// prosta klasa produktu, który ma swoją nazwę i cenę (w groszach)
public class Product {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // gettery - metody dostępowe dla pól
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    // setterów nie ustawiamy, bo zakładamy że produkty nie zmieniają
    // swojej nazwy ani ceny

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

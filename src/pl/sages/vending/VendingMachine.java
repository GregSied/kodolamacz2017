package pl.sages.vending;

public class VendingMachine {

    Shelf[] shelves = new Shelf[10];

    String display = "";

    public VendingMachine(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            shelves[i] = new Shelf(product, 1);
        }
    }

    public String getDisplay() {
        return display;
    }

    public void pushButton(int i) {
        // podwójne || bo jest wydajniejsze
        // jeśli i == -1 to wtedy pierwszy warunek będzie TRUE
        // i nie będzie potrzeby sprawdzać drugiego
        // true || COKOLWIEK zawsze jest TRUE
        // nie ma znaczenia wynik i > 9
        if (i < 0 || i > 9) {
            System.out.println("Nie ma takiego przycisku");
            return;
        }
        if (shelves[i].isEmpty()) {
            this.display = "Półka pusta";
        } else {
            this.display = "Cena: " + shelves[i].getItemPrice();
        }

    }

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(ProductFactory.getProducts());
        vendingMachine.pushButton(1);
        System.out.println(vendingMachine.getDisplay());
    }
}

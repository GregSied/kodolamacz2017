package pl.sages.vending;

import java.util.List;

public class VendingMachine {

    Shelf[] shelves = new Shelf[10];

    String display = "";
    private CoinDispenser coinDispenser = new CoinDispenser();
    private int lastPushedButton;

    public VendingMachine(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            shelves[i] = new Shelf(product, 1);
        }

        // itar - tablice
        // iter - foreach for(Klasa obiekt : obiekty){}
        // fori - zwykła pętla for(int i = 0; i < ? ; i++)
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
        lastPushedButton = i;
        if (shelves[i].isEmpty()) {
            this.display = "Półka pusta";
        } else {
            refreshDisplay();
        }

    }

    private void refreshDisplay() {
        this.display = "Produkt: "+shelves[lastPushedButton].getItemName()+
                " Cena: " + shelves[lastPushedButton].getItemPrice() +
                " Pozostało: " + (shelves[lastPushedButton].getItemPrice() - coinDispenser.getTotal());
    }

    public void insertCoin(Coin coin){
        coinDispenser.insert(coin);
        refreshDisplay();
    }

    public void cancel(){
        List<Coin> coins = coinDispenser.returnCoins();
        System.out.println("Zwracam monety ");
        for (Coin coin : coins) {
            System.out.print(coin.toString() + " ");
        }
    }

    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(ProductFactory.getRandomProducts());
        machine.pushButton(4);
        System.out.println(machine.getDisplay());
        System.out.println("Wrzucam 50 groszy");
        machine.insertCoin(Coin.FIFTY_GROSZY);
        System.out.println(machine.getDisplay());
        machine.insertCoin(Coin.FIFTY_GROSZY);
        System.out.println(machine.getDisplay());
        machine.cancel();
    }
}

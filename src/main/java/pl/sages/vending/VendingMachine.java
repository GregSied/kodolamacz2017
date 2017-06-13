package pl.sages.vending;

import java.util.Arrays;
import java.util.List;

public class VendingMachine {

    // maszyna ma 10 półek numerowanych tak jak przyciski od 0 do 9
    Shelf[] shelves = new Shelf[10];

    // maszyna ma wyświetlacz, który wyświetla informację o cenie i nazwie produktu
    String display = "";

    // klasa, która zajmuje się obsługą monet (przyjmowanie, wydawanie, zliczanie)
    private CoinDispenser coinDispenser =
            new CoinDispenser(Arrays.asList(Coin.TWENTY_GROSZY,
                Coin.ONE_ZLOTY, Coin.TWO_ZLOTY, Coin.TEN_GROSZY,
                Coin.TWENTY_GROSZY, Coin.TEN_GROSZY));

    // pomocnicza zmienna, która zapamiętuje jaki przycisk został wciśniety
    // czyli jaki produkt (z której półki) został wybrany
    private int lastPushedButton;

    // konstruktor, który przyjmuje tablicę produktów,
    // wkłada każdy produkt na osobną półkę (po jednym)
    public VendingMachine(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            shelves[i] = new Shelf(product, 1);
        }

        // itar - tablice
        // iter - foreach for(Klasa obiekt : obiekty){}
        // fori - zwykła pętla for(int i = 0; i < ? ; i++)
    }

    // zwraca obecny stan wyświetlacza
    public String getDisplay() {
        return display;
    }

    // metoda dla użytkownika - wciska przycisk i wybiera półkę z produktem
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
        // ustawiamy pomocniczą zmienną
        lastPushedButton = i;

        // odświeżamy wyświetlacz, aby pokazać informację o produkcie
        refreshDisplay();

    }

    // PRYWATNA metoda - użytkownik automatu nie powinien mieć możliwości
    // odświeżania wyświetlacza - maszyna sama powinna wiedzieć kiedy to zrobić
    // - np po wrzuceniu monety, wciśnięciu przycisku czy wydaniu produktu
    private void refreshDisplay() {
        Shelf shelf = shelves[lastPushedButton];
        if (shelf.isEmpty()) {
            this.display = "Półka pusta";
        } else {
            this.display = "Produkt: " + shelf.getItemName() +
                    " Ilość: " + shelf.getItemCount() +
                    " Cena: " + shelf.getItemPrice() +
                    " Pozostało: " + (shelf.getItemPrice() - coinDispenser.getTotal());
        }
    }

    // publiczna metoda dla użytkownika automatu
    public void insertCoin(Coin coin){
        coinDispenser.insert(coin);
        Shelf shelf = shelves[lastPushedButton];
        // jeśli wybrana półka nie jest pusta i użytkownik wrzucił odpowiednią kwotę
        if(!shelf.isEmpty() & shelf.getItemPrice() <= coinDispenser.getTotal()){
            int change = coinDispenser.getTotal() - shelf.getItemPrice();
            // jeśli jeszcze automat może wydać resztę to dopiero sprzedajemy produkt
            if(coinDispenser.canReturnChange(change)){
                System.out.println("Oddajemy resztę "+coinDispenser.returnChange(change));
                System.out.println("Wydano produkt: "+shelf.removeOneItem());
            }else{
                // jeśli nie może oddać to musimy wycofać zakup (anulować)
                System.out.println("Nie można wydać reszty");
                cancel();
            }
        }
        // niezależnie od tego co się wydarzyło, należy odświeżyć wyświetlacz
        refreshDisplay();
    }

    // zakładamy, że ta metoda jest wywołana tylko jeśli
    // wrzucono odpowiednią kwotę do maszyny
    private Product giveProduct(){
        // można tak, ale to nie jest programowanie obiektowe:
        // shelves[lastPushedButton].setItemCount(shelves[lastPushedButton].getItemCount()-1);
        return shelves[lastPushedButton].getProduct();
    }

    // anulowanie zakupu i zwrócenie użytkownikowi jego pieniędzy
    public void cancel(){
        List<Coin> coins = coinDispenser.returnCoins();
        System.out.println("Zwracam monety ");
        for (Coin coin : coins) {
            System.out.print(coin.toString() + " ");
        }
    }

    // main, który pozwala nam testować automat
    public static void main(String[] args) {
        // tworzymy nowy automat przez konstruktor
        // przekazujemy mu podrukty z fabryki
        VendingMachine machine = new VendingMachine(ProductFactory.getRandomProducts());
        // wciskamy przycisk i wybieramy półkę
        machine.pushButton(4);
        // sprawdzamy czy wyświetlacz się odświeżył i pokazuję cene produktu
        System.out.println(machine.getDisplay());
        System.out.println("Wrzucam 200 groszy");
        machine.insertCoin(Coin.TWO_ZLOTY);
        // sprawdzamy czy po wrzuceniu monety kwota pozostała do wrzucenia się zmniejszyła
        System.out.println(machine.getDisplay());
        machine.insertCoin(Coin.TWO_ZLOTY);
        System.out.println(machine.getDisplay());
        machine.cancel();
    }
}

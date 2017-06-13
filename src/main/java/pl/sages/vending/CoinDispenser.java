package pl.sages.vending;

import java.util.*;

public class CoinDispenser {

    private int insertedCoinSum = 0;
    private List<Coin> insertedCoin = new ArrayList<>();
    private List<Coin> ownCoin = new ArrayList<>();

    // konstruktor, który przyjmuję liste monet jakie maszynka
    // ma do wydawania reszty
    public CoinDispenser(List<Coin> ownCoin) {
        this.ownCoin = ownCoin;
    }

    // metoda pozwalająca wrzucić monety do maszynki
    // te monety powinny być przechowywane osobno, aby w razie
    // anulowania zakupu można było zwrócić użytkownikowi te same monety
    // ktore wrzucił do nas
    public void insert(Coin coin) {
        // dodajemy wrzucną monetę do listy
        insertedCoin.add(coin);
        insertedCoinSum += coin.getValue();
    }

    // publiczna metoda dostępna dla wszystkich
    // ona wywołuje jedną z dwóch równoważnych implementacji
    public int getTotal(){
        return getTotal1();
    }

    // zbieram monety i na koniec iteruję się po wszystkich
    // aby zsumować łączny wynik
    private int getTotal1(){
        // inicjujemy początkową wartość sumy wrzuconych monet na 0
        int sum = 0;
        // w pętli przechodzimy po wszystkich wrzuconych monetach
        for (Coin coin : insertedCoin) {
            // dodajemy ich wartości
            sum += coin.getValue();
            // += to to samo co
            // sum = sum + coin.getValue();
        }
        return sum;
    }

    // podczas wrzucania monet już dodaję ich wartości
    // więc na końcu wystarczy tylko zwrócić wartość
    // JEDNAK NIE NAJLEPSZE PODEJŚCIE
    // bo zbyt wiele razy manipulujmey listą wrzucanych monet
    // przez to w zbyt wielu miejscach trzeba pamiętać o odpowiednim
    // ustawieniu tej zmiennej
    private int getTotal2(){
        return insertedCoinSum;
    }

    // metoda sprawdza czy nasza maszynka jest w stanie wydać
    // resztę z posiadanych monet (zarówno własnych jak i wrzuconych
    // przez użytkownika)
    public boolean canReturnChange(final int change){
        // tworzymy nową listę, która będzie przechowywać WSZYSTKIE monety
        List<Coin> allCoins = new ArrayList<>();
        allCoins.addAll(this.insertedCoin);
        allCoins.addAll(this.ownCoin);
        Collections.sort(allCoins);
        int remainingChange = change;
        for (Coin coin : allCoins) {
            if(coin.getValue() <= remainingChange){
                // a -= b to to samo co a = a-b;
                // a += b to to samo co a = a+b;
                remainingChange -= coin.getValue();
                if(remainingChange==0){
                    return true;
                }
            }
        }
        return false;
    }

    // algorytm bardzo podobny do tego z poprzedniej metody
    // tylko dodatkowo na osobną listę odkładamy monety, które
    // należy zwrócić użytkownikowi w postaci listy
    public List<Coin> returnChange(int change){
        List<Coin> allCoins = new ArrayList<>();
        allCoins.addAll(this.insertedCoin);
        allCoins.addAll(this.ownCoin);
        Collections.sort(allCoins);

        // dodatkowa lista gdzie odkładamy monety do zwrócenia
        List<Coin> changeCoins = new ArrayList<>();
        List<Coin> newOwnCoins = new ArrayList<>();

        for (Coin coin : allCoins) {
            // jeśli moneta powinna być wydana
            if(coin.getValue() <= change){
                change -= coin.getValue();
                // to dodajemy ją do listy
                changeCoins.add(coin);
                // jeśli już nic nie zostało do wydania
                if(change==0){
                    // to przerywamy pętle
                    break;
                }
            }else{
                // jeśli jej nie oddajmy
                // to zostawiamy w maszynie
                newOwnCoins.add(coin);
            }
        }
        this.insertedCoin.clear();
        this.ownCoin = newOwnCoins;
        return changeCoins;
    }

    // metoda zwracająca wszystkie wrzucone przez użytkownika
    // monety - przydatne w przypadku anulowania zakupu
    public List<Coin> returnCoins() {
        List<Coin> coinsToReturn = this.insertedCoin;
        insertedCoin = new ArrayList<>();
        // oddajemy monety, więc suma wrzucony monet musi być 0
        //insertedCoinSum = 0;
        return coinsToReturn;
    }
}

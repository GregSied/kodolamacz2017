package pl.sages.vending;

import java.util.ArrayList;
import java.util.List;

public class CoinDispenser {

    private int insertedCoinSum = 0;
    private List<Coin> insertedCoin = new ArrayList<>();

    public void insert(Coin coin) {
        insertedCoin.add(coin);
        insertedCoinSum += coin.getValue();
    }

    public int getTotal(){
        return getTotal2();
    }

    // zbieram monety i na koniec iteruję się po wszystkich
    // aby zsumować łączny wynik
    private int getTotal1(){
        int sum = 0;
        for (Coin coin : insertedCoin) {
            sum += coin.getValue();
            // += to to samo co
            // sum = sum + coin.getValue();
        }
        return sum;
    }

    // podczas wrzucania monet już dodaję ich wartości
    // więc na końcu wystarczy tylko zwrócić wartość
    private int getTotal2(){
        return insertedCoinSum;
    }

    public List<Coin> returnCoins() {
        List<Coin> coinsToReturn = this.insertedCoin;
        insertedCoin = new ArrayList<>();
        return coinsToReturn;
    }
}

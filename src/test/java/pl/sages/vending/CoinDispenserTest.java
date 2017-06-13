package pl.sages.vending;

import java.util.Arrays;

public class CoinDispenserTest {

    public static void shouldReturnChange(){
        // given
        CoinDispenser coinDispenser = new CoinDispenser(Arrays.asList(
                Coin.FIFTY_GROSZY, Coin.TEN_GROSZY));

        // when
        coinDispenser.insert(Coin.TWO_ZLOTY);

        // then
        if (coinDispenser.canReturnChange(60)) {
            System.out.println("Test OK");
        }else{
            System.out.println("Test NIE OK");
        }
    }

    public static void main(String[] args) {
        shouldReturnChange();
    }

}

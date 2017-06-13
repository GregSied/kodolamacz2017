package pl.sages.shop;

import java.util.Date;

public class Order {

    int[] quantities;
    Date date;

    // jeśli przekazuję tylko liczność to data jest aktualna
    public Order(int[] quantities) {
        this(quantities, new Date());
    }

    // a tutaj mam możliwość ustawienia innej (przeszłej i przyszłej) daty
    public Order(int[] quantities, Date date) {
        this.quantities = quantities;
        this.date = date;
    }
}

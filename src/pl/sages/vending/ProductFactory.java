package pl.sages.vending;

import java.util.Random;

public class ProductFactory {

    static final String[] NAMES = {"Cola", "Pepsi", "Batonik", "Paluszki","Soczek"};

    public static Product[] getProducts(){
        Product[] products = new Product[10];

        int i = 0;
        for (String name : NAMES) {
            products[i++] = new Product(name, i*20);
            products[i++] = new Product(name, i*20);
        }
        return products;
    }

    public static Product[] getRandomProducts(){
        Product[] products = new Product[10];

        // klasa random generuje pseudolosowe liczby
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            // na kolejne miejsca w tablicy products wkładam
            // losowo wygenerowane produkty - nazwa jest losowana z tablicy
            // i cena z zakresu 10-500 (w skokach co 10)
            // 10, 20, 30 ... 490, 500
            products[i] = new Product(NAMES[random.nextInt(NAMES.length)],
                    10*(random.nextInt(50)+1));
        }
        return products;
    }

}

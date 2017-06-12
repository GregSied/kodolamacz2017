package pl.sages.vending;

public class ProductFactory {

    public static Product[] getProducts(){
        String[] names = {"Cola", "Pepsi", "Batonik", "Paluszki","Soczek"};
        Product[] products = new Product[10];

        int i = 0;
        for (String name : names) {
            products[i++] = new Product(name, i*20);
            products[i++] = new Product(name, i*20);
        }
        return products;
    }

}

package pl.sages.shop;

import java.util.Arrays;

public class Shop {

    String address;
    String[] products = generateProducts();
    int[] quantities = {5, 10};

    public Shop(String address) {
        this.address = address;
    }

    private String[] generateProducts(){
        String[] p ={"Mleko", "Pepsi"};
        return p;
    }

    void accept(Order order){
        // jak wchodzi zamówienie to na podstawie liczności z zamówienia
        // chcemy zaktualizować stan magazynowy w sklepie (tab quantities)
    }

    public static void main(String[] args) {
        Shop shop = new Shop("Marszałkowska 18");
        int[] orderQuantities = {20, 50};
        Order order = new Order(orderQuantities);

        shop.accept(order);

        if(shop.quantities[0] == 25){
            System.out.println("Mleko zostało przyjęte");
        }else{
            System.out.println("Mleko nie zostało przyjęte");
        }

    }

}

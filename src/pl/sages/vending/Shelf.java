package pl.sages.vending;

public class Shelf {

    private Product product;
    private int itemCount;

    public Shelf(Product product, int itemCount) {
        this.product = product;
        this.itemCount = itemCount;
    }

    public boolean isEmpty() {
        return itemCount == 0;
        // prostsza wersja tego co poniżej:
        // nawet sama Idea podpowiada aby to uprościć
//        if(itemCount == 0){
//            return true;
//        }else{
//            return false;
//        }
    }

    public int getItemPrice() {
        return product.getPrice();
    }

    public String getItemName() {
        return product.getName();
    }

    public Product removeOneItem(){
        // zmniejszamy licznik produktów
        this.itemCount--;
        // zwracamy produkt, który na danej półce się znajduje
        return this.product;
    }

    public int getItemCount() {
        return itemCount;
    }


    public Product getProduct() {
        return product;
    }
}

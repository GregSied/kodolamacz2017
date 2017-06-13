package pl.sages.kodolamacz;

public class FastOrder extends Order {

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + 500;
    }
}

package pl.sages.kodolamacz;

public class ForeignOrder extends Order {

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + 1500;
    }
}
